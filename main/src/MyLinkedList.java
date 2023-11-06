package src;

import java.util.ArrayList;

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(index, val);
 * obj.addAtTail(index, val);
 * obj.add(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public class MyLinkedList {

    int size;
    Node firstNode;
    Node lastNode;

    public class Node {
        Integer val;
        Node prev;
        Node next;
        Node(int val, Node prev, Node next) {
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
            Node nowNode = firstNode;

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
            firstNode = new Node(val, null, null);
            lastNode = firstNode;
        } else {
            Node first = firstNode;
            firstNode = new Node(val, null, first);
            first.prev = firstNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (size==0) {
            addAtHead(val);
        } else {
            Node last = lastNode;
            lastNode = new Node(val, last, null);
            last.next = lastNode;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index<0 || index>size) {
            throw new RuntimeException("bad index");
        } else if (index==size) {
            addAtTail(val);
        } else if (index==0) {
            addAtHead(val);
        } else {
            Node newNode;
            if (size / 2 + 1 > index) {
                Node nowNode = firstNode;
                for (int i=0; i<index; i++) {
                    nowNode = nowNode.next;
                }
                newNode = new Node(val, nowNode.prev, nowNode);
            } else {
                Node nowNode = lastNode;
                for (int i=size-1; i>index; i--) {
                    nowNode = nowNode.prev;
                }
                newNode = new Node(val, nowNode, nowNode.next);
            }
            newNode.next.prev = newNode;
            newNode.prev.next = newNode;
            size++;
        }
    }

    public void add(int val) {
        addAtTail(val);
    }

    public void deleteAtIndex(int index) {
        if (index<0 || index>=size) {
            return;
        }
        int counter = 0;
        Node nowNode = firstNode;

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


