package src.Sort;

import static src.Helpers.swapValuesOfArray;

public class SelectionSort {
    public static void selectionSortIncreasing(int[] ar) {
        for (int i=0; i<ar.length-1; i++) {
            int curMinIndex = i;
            int curMin = ar[i];
            for (int j=i+1; j<ar.length; j++) {
                if (ar[j] < curMin) {
                    curMinIndex = j;
                    curMin = ar[j];
                }
            }
            swapValuesOfArray(ar, curMinIndex, i);
        }
    }

    public static void selectionSortDecreasing(int[] ar) {
        for (int i=0; i<ar.length; i++) {
            int curMaxIndex = i;
            int curMax = ar[i];
            for (int j=i+1; j<ar.length; j++) {
                if (ar[j] > curMax) {
                    curMaxIndex = j;
                    curMax = ar[j];
                }
            }
            swapValuesOfArray(ar, curMaxIndex, i);
        }
    }
}