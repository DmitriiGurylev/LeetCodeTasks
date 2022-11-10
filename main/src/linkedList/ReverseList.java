package src.linkedList;

import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if (head==null) {
            return null;
        }
        List<ListNode> list = new LinkedList<>();
        while (head!=null) {
            list.add(head);
            head = head.next;
        }

        for (int i=list.size()-1; i>0; i--) {
            ListNode current = list.get(i);
            current.next = list.get(i-1);
            list.get(i-1).next=null;

        }
        return list.get(list.size()-1);
    }
}
