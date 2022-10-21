package src;

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {
        System.out.println(new Task22().reverseWords("a b c d     e f"));
        System.out.println(new Task22().reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        String[] reverseStringArray = Arrays.stream(s.split("\\s+"))
                .filter(subStr -> !subStr.equals(""))
                .toArray(String[]::new);

        for (int i=0; i<reverseStringArray.length; i++) {
            String word = reverseStringArray[i];
            StringBuilder newWord = new StringBuilder();
            for (char c: word.toCharArray()) {
                newWord.insert(0, c);
            }
            reverseStringArray[i] = newWord.toString();
        }

        StringBuilder newS = new StringBuilder();
        int wordNow = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.toCharArray()[i]==' ') {
                newS.append(s.toCharArray()[i]);
            } else {
                newS.append(reverseStringArray[wordNow]);
                i += reverseStringArray[wordNow].length()-1;
                wordNow++;
            }
        }
        return newS.toString();
    }
}

