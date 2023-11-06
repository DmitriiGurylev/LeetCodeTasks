package src;

import java.util.Arrays;

/**
 * Your MyArrayList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(index, val);
 * obj.addAtTail(index, val);
 * obj.add(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public class MyArrayList {

    int size;
    int arrayCurrentSize;
    int[] actualArray;


    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initSize) {
        if (initSize > 0) {
            size = 0;
            arrayCurrentSize = initSize;
            actualArray = new int[arrayCurrentSize];
        } else {
            throw new RuntimeException("bad initSize");
        }
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return actualArray[index];
        }
        throw new RuntimeException("bad index");
    }

    public void addAtHead(int val) {
        if (size == 0) {
            actualArray[0] = val;
        } else if (size == arrayCurrentSize) {
            int[] tmpArray = copyIntArray(actualArray);
            arrayCurrentSize = arrayCurrentSize * 2;
            actualArray = new int[arrayCurrentSize];
            actualArray[0] = val;
            System.arraycopy(tmpArray, 0, actualArray, 1, size);
        } else {
            int[] tmpArray = copyIntArray(actualArray);
            actualArray[0] = val;
            System.arraycopy(tmpArray, 0, actualArray, 1, size);
        }
        size++;
    }

    public void addAtTail(int val) {
        if (size==0) {
            addAtHead(val);
        } else {
            if (size < arrayCurrentSize) {
                actualArray[size] = val;
            } else {
                int[] tmpArray = copyIntArray(actualArray);
                arrayCurrentSize = arrayCurrentSize * 2;
                actualArray = new int[arrayCurrentSize];
                System.arraycopy(tmpArray, 0, actualArray, 0, size);
                actualArray[size] = val;
            }
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index<0 || index>size) {
            throw new RuntimeException("bad index");
        } else if (index==size) {
            addAtTail(val);
        } else if (index==0) {
            addAtHead(val);
        } else {
            int [] tmpArray = copyIntArray(actualArray);
            if (size >= arrayCurrentSize) {
                arrayCurrentSize = arrayCurrentSize * 2;
                actualArray = new int[arrayCurrentSize];
            }
            System.arraycopy(tmpArray, 0, actualArray, 0, index);
            actualArray[index] = val;
            System.arraycopy(tmpArray, index, actualArray, index + 1, size - index);
            size++;
        }
    }

    public void add(int val) {
        addAtTail(val);
    }

    public void deleteAtIndex(int index) {
        if (index<0 || index>=size) {
            return;
        } else if (index == size-1) {
            size--;
        } else {
            for (int i=index+1; i<size; i++) {
                actualArray[i-1] = actualArray[i];
            }
            size--;
        }
    }

    private int[] copyIntArray(int[] arr) {
        int[] resArr = new int[arr.length];
        System.arraycopy(arr, 0, resArr, 0, arr.length);
        return resArr;
    }
}


