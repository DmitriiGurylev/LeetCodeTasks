package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.MyHashSet;


public class MyHashSetTest {
    @Test
    public void test() {
        MyHashSet myhs = new MyHashSet();
        myhs.add(1);
        myhs.add(2);
        Assertions.assertTrue(myhs.contains(1));
        Assertions.assertTrue(myhs.contains(3));
        myhs.add(2);
        Assertions.assertTrue(myhs.contains(2));
        myhs.remove(2);
        Assertions.assertTrue(myhs.contains(2));
    }
}
