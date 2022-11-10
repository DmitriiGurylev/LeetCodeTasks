package src.linkedList;

/* You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MegreKList {
    public static void main (String[] args) {}

    public ListNode mergeKLists(ListNode[] lists) {
        long values = 0;
        for (ListNode list : lists) {
            ListNode head = list;
            while (head != null) {
                values++;
                head = head.next;
            }
        }
        if (values==0) {
            return null;
        }
        ListNode firstEl = null;
        ListNode head = new ListNode(0);

        boolean firstElFound = false;
        for (int i=0; i<values; i++) {
            head.next = compareAll(lists);
            if (!firstElFound) {
                firstEl = head.next;
                firstElFound = true;
            }
            head = head.next;
        }
        return firstEl;
    }

    private ListNode compareAll(ListNode[] listNodes) {
        ListNode min = new ListNode(Integer.MAX_VALUE);
        int listIndex = 0;
        for (int i=0; i<listNodes.length; i++) {
            if (listNodes[i] != null && listNodes[i].val < min.val) {
                min = listNodes[i];
                listIndex = i;
            }
        }
        listNodes[listIndex] = listNodes[listIndex].next;
        return min;
    }
}
