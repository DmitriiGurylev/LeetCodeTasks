//package src;
//
///* Given the head of a sorted linked list,
// * delete all nodes that have duplicate numbers,
// * leaving only distinct numbers from the original list.
// * Return the linked list sorted as well.
// *
// * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3593/
// */
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head==null)
//            return null;
//        else if (head.next==null){
//            return head;
//        }
//        else if (head.val==head.next.val){
//            head.next = findNext(head.next);
//            head.next = deleteDuplicates(head.next);
//            return head.next;
//        }
//        else{
//            head.next = deleteDuplicates(head.next);
//            return head;
//        }
//    }
//
//    public ListNode findNext(ListNode head){
//        if (head.next==null)
//            return null;
//        if (head.val==head.next.val){
//            head.next = findNext(head.next);
//            return head.next;
//        }
//        else{
//            return head.next;
//        }
//
//    }
//}