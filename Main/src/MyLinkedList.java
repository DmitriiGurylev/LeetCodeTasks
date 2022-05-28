package src;

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
class MyLinkedList {

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
        int param_1 = obj.get(1);
        obj.deleteAtIndex(1);
        int param_2 = obj.get(1);
    }



    int size;
    DoubleListNode firstNode;
    DoubleListNode lastNode;

    public class DoubleListNode {
        Integer val;
        DoubleListNode prev;
        DoubleListNode next;
        DoubleListNode(DoubleListNode prev, int val, DoubleListNode next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public MyLinkedList() {
        size = 0;
        firstNode = null;
        lastNode = null;
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            int counter = 0;
            DoubleListNode nowNode = firstNode;

            for (int i = 0; i < size; i++) {
                if (index == counter) {
                    return nowNode.val;
                }
                nowNode = nowNode.next;
                counter++;
            }
        }
        return -1;
    }

    public void addAtHead(int val) {
        if (size == 0) {
            firstNode = new DoubleListNode(null, val, null);
            lastNode = firstNode;
        } else {
            DoubleListNode first = firstNode;
            firstNode = new DoubleListNode(null, val, first);
            first.prev = firstNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (size==0) {
            lastNode = new DoubleListNode(null, val, null);
            firstNode = lastNode;
        } else {
            DoubleListNode last = lastNode;
            lastNode = new DoubleListNode(last, val, null);
            last.next = lastNode;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index<0 || index>size) {
        } else if (index==size) {
            addAtTail(val);
        } else if (index==0) {
            addAtHead(val);
        } else {
            int counter = 0;
            DoubleListNode nowNode = firstNode;

            for (int i = 0; i < size; i++) {
                if (index == counter) {
                    break;
                }
                nowNode = nowNode.next;
                counter++;
            }
            DoubleListNode newNode = new DoubleListNode(nowNode.prev, val, nowNode);

            if (nowNode.prev!=null) {
                nowNode.prev.next = newNode;
            }
            nowNode.prev = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index<0 || index>=size) {
            return;
        }
        int counter = 0;
        DoubleListNode nowNode = firstNode;

        for (int i = 0; i < size; i++) {
            if (index == counter) {
                break;
            }
            nowNode = nowNode.next;
            counter++;
        }
        if (nowNode.prev == null) {
            firstNode = nowNode.next;
        } else {
            nowNode.prev.next = nowNode.next;
        }

        if (nowNode.next == null) {
            lastNode = nowNode.prev;
        } else {
            nowNode.next.prev = nowNode.prev;
        }
        size--;
    }
}


