package src.linkedList;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {

    public static void main (String[] args) {}

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
