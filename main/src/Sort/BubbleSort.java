package src.Sort;

import static src.Helpers.swapValuesOfArray;

public class BubbleSort {

    public static int[] bubbleSortIncreasing(int[] ar) {
        boolean innerCycle=true;
        int i=0;
        while (innerCycle) {
            innerCycle=false;
            for (int j = 1; j < ar.length-i; j++) {
                if (ar[j-1] > ar[j]) {
                    innerCycle = true;
                    swapValuesOfArray(ar, j, j-1);
                }
            }
            i++;
        }
        return ar;
    }

    public static int[] bubbleSortDecreasing(int[] ar) {
        boolean innerCycle=true;
        int i=0;
        while (innerCycle) {
            innerCycle=false;
            for (int j = ar.length-1; j > i; j--) {
                if (ar[j - 1] < ar[j]) {
                    innerCycle = true;
                    swapValuesOfArray(ar, j, j-1);
                }
            }
            i++;
        }
        return ar;
    }


}