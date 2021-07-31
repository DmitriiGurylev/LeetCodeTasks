package src;

/* Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 *
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3592/
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
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode nodeNow = new ListNode();
        if (l1==null && l2==null)
            return null;
        else if (l1==null){
            nodeNow = l2;
            nodeNow.next = mergeTwoLists(l1, l2.next);
        }
        else if (l2==null){
            nodeNow = l1;
            nodeNow.next = mergeTwoLists(l2, l1.next);
        }
        else if (l1.val <= l2.val){
            nodeNow.val = l1.val;
            nodeNow.next = mergeTwoLists(l1.next, l2);
        }
        else{
            nodeNow.val = l2.val;
            nodeNow.next = mergeTwoLists(l2.next, l1);
        }
        return nodeNow;
    }
}