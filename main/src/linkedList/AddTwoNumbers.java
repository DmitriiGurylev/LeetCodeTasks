package src.linkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstEl = new ListNode();
        ListNode head = firstEl;

        byte rest = 0;
        while (l1!=null || l2!=null || rest!=0) {
            if (l1==null && l2==null) {
                head.next = new ListNode(rest);
                return firstEl.next;
            } else if (l1==null) {
                int sum = l2.val + rest;
                if (sum>9) {
                    rest = (byte) (sum / 10);
                    sum = sum % 10;
                } else {
                    rest =0;
                }
                head.next = new ListNode(sum);
                l2 = l2.next;
                head = head.next;
            } else if (l2==null) {
                int sum = l1.val + rest;
                if (sum>9) {
                    rest = (byte) (sum / 10);
                    sum = sum % 10;
                } else {
                    rest =0;
                }
                head.next = new ListNode(sum);
                l1 = l1.next;
                head = head.next;
            } else {
                int sum = l1.val + l2.val + rest;
                if (sum>9) {
                    rest = (byte) (sum / 10);
                    sum = sum % 10;
                } else {
                    rest = 0;
                }
                head.next = new ListNode(sum);
                l1 = l1.next;
                l2 = l2.next;
                head = head.next;
            }
        }
        return firstEl.next;
    }
}
