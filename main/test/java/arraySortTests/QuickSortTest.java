package test.java.arraySortTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Sort.MergeSort;
import src.Sort.QuickSort;

import java.util.Arrays;


public class QuickSortTest {
    @Test
    public void test() {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        QuickSort.quickSortIncreasing(array);
        Assertions.assertEquals(
                Arrays.toString(array),
                "[2, 3, 4, 4, 5, 5, 5, 5, 7, 8, 17, 20, 21, 31, 31, 35, " +
                        "43, 52, 61, 74, 75, 75, 75, 75, 76, 99, 542, 544, 51451]");

        QuickSort.quickSortDecreasing(array);
        Assertions.assertEquals(
                Arrays.toString(array),
                "[51451, 544, 542, 99, 76, 75, 75, 75, 75, 74, 61, 52, " +
                        "43, 35, 31, 31, 21, 20, 17, 8, 7, 5, 5, 5, 5, 4, 4, 3, 2]");
    }
}
