package src;

import java.util.*;

public class OpentheLock {

    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        for (String d: deadends) {
            set.add(d);
        }

        String s = "0000";
        q.add(s);
        if (set.contains(s)) {
            return -1;
        }
        set.add(s);
        int count = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i=0; i<size; i++) {
                String curS = q.peek();
                if (curS.equals(target)) {
                    return count;
                }
                addChildrenToQueue(curS, q, set);
                q.poll();
            }
            count++;
        }
        return -1;
    }

    private void addChildrenToQueue(String s, Queue q, Set visitedSet) {
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(1);
        char ch3 = s.charAt(2);
        char ch4 = s.charAt(3);

        List<String> l = new LinkedList<>() {{
            add("" + incrementChar(ch1) + ch2 + ch3 + ch4);
            add("" + decrementChar(ch1) + ch2 + ch3 + ch4);
            add("" + ch1 + incrementChar(ch2) + ch3 + ch4);
            add("" + ch1 + decrementChar(ch2) + ch3 + ch4);
            add("" + ch1  + ch2 + incrementChar(ch3) + ch4);
            add("" + ch1  + ch2 + decrementChar(ch3) + ch4);
            add("" + ch1  + ch2 + ch3 + incrementChar(ch4));
            add("" + ch1  + ch2 + ch3 + decrementChar(ch4));
        }};
        for (String el: l) {
            if (!visitedSet.contains(el)) {
                q.offer(el);
                visitedSet.add(el);
            }
        }
    }

    private static int incrementChar(char v) {
        return (v == '9') ? (char) 0 :(char) (Character.getNumericValue(v)+1);
    }

    private static int decrementChar(char v) {
        return (v == '0') ? (char) 9 :(char) (Character.getNumericValue(v)-1);
    }
}