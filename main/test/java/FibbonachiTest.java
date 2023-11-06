package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Fibbonachi;


public class FibbonachiTest {
    @Test
    public void test() {
        Assertions.assertEquals(Fibbonachi.fibbIter(-1), -1);
        Assertions.assertEquals(Fibbonachi.fibbIter(1), 1);
        Assertions.assertEquals(Fibbonachi.fibbIter(2), 1);
        Assertions.assertEquals(Fibbonachi.fibbIter(4), 3);
        Assertions.assertEquals(Fibbonachi.fibbIter(8), 21);
        Assertions.assertEquals(Fibbonachi.fibbIter(16), 987);
        Assertions.assertEquals(Fibbonachi.fibbIter(32), 2178309);
        Assertions.assertEquals(Fibbonachi.fibbIter(64), 1640636603);

        Assertions.assertEquals(Fibbonachi.fibbRec(-1), -1);
        Assertions.assertEquals(Fibbonachi.fibbRec(1), 1);
        Assertions.assertEquals(Fibbonachi.fibbRec(2), 1);
        Assertions.assertEquals(Fibbonachi.fibbRec(4), 3);
        Assertions.assertEquals(Fibbonachi.fibbRec(8), 21);
        Assertions.assertEquals(Fibbonachi.fibbRec(16), 987);
        Assertions.assertEquals(Fibbonachi.fibbRec(32), 2178309);
        Assertions.assertEquals(Fibbonachi.fibbRec(64), 1640636603);
    }
}
