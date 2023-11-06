package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.MyArrayList;


public class MyArrayListTest {
    @Test
    public void test() {
        MyArrayList myal = new MyArrayList(2);
        myal.add(10); // [10]
        myal.add(10); // [10, 10]
        myal.add(10); // [10, 10, 10]
        myal.add(10); // [10, 10, 10, 10]
        myal.add(10); // [10, 10, 10, 10, 10]
        myal.addAtHead(1); // [1, 10, 10, 10, 10, 10]
        myal.addAtTail(1); // [1, 10, 10, 10, 10, 10, 1]
        myal.addAtIndex(1,5); // [1, 5, 10, 10, 10, 10, 10, 1]
        myal.addAtIndex(4,5); // [1, 5, 10, 10, 5, 10, 10, 10, 1]
        Assertions.assertEquals(myal.get(1), 5);
        Assertions.assertEquals(myal.get(4), 5);
        Assertions.assertEquals(myal.get(5), 10);
        myal.deleteAtIndex(4); // [1, 5, 10, 10, 10, 10, 10, 1]
        Assertions.assertEquals( myal.get(6), 10);
    }
}
