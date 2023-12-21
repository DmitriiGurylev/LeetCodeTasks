package test.java;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.OpentheLock;

class OpentheLockTest {

    @Test
    public void test() {
        OpentheLock otl = new OpentheLock();
        String[] dead = {"0201","0101","0102","1212","2002"};
        String t = "0202";

        int c = otl.openLock(dead, t);
        Assertions.assertEquals(6, c);
    }
}