package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.MyLinkedList;


public class MyLinkedListTest {
    @Test
    public void test() {
        MyLinkedList myll = new MyLinkedList();
        myll.add(10); // [10]
        myll.add(10); // [10, 10]
        myll.add(10); // [10, 10, 10]
        myll.add(10); // [10, 10, 10, 10]
        myll.add(10); // [10, 10, 10, 10, 10]
        myll.addAtHead(1); // [1, 10, 10, 10, 10, 10]
        myll.addAtTail(1); // [1, 10, 10, 10, 10, 10, 1]
        myll.addAtIndex(1,5); // [1, 5, 10, 10, 10, 10, 10, 1]
        myll.addAtIndex(4,5); // [1, 5, 10, 10, 5, 10, 10, 10, 1]
        Assertions.assertEquals(myll.get(1), 5);
        Assertions.assertEquals(myll.get(4), 5);
        Assertions.assertEquals(myll.get(5), 10);
        myll.deleteAtIndex(4); // [1, 5, 10, 10, 10, 10, 10, 1]
        Assertions.assertEquals( myll.get(6), 10);
    }
}
