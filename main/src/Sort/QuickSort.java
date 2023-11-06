package src.Sort;

import static src.Helpers.swapValuesOfArray;

public class QuickSort {

    public static int[] quickSortIncreasing(int[] ar) {
        return quickSortRecursive(ar,0, ar.length-1, true);
    }

    public static int[] quickSortDecreasing(int[] ar) {
        return quickSortRecursive(ar,0, ar.length-1, false);
    }

    public static int[] quickSortRecursive(int[] array, int left, int right, boolean isIncr) {
        if (left<right) {
            int pivot = partition(array, left, right, isIncr);
            quickSortRecursive(array, left, pivot-1, isIncr);
            quickSortRecursive(array, pivot+1, right, isIncr);
        }
        return array;
    }
    public static int partition(int[] ar,int left, int right, boolean isIncr) {
        int divider = ar[right];
        int i = left - 1;
        if (isIncr) {
            for (int j = left; j < right - 1; j++) {
                if (ar[j] < divider) {
                    i++;
                    swapValuesOfArray(ar, j, i);
                }
            }
            i++;
        } else {
            for (int j = right; j > left; j--) {
                if (ar[j] > divider) {
                    i--;
                    swapValuesOfArray(ar, j, i);
                }
            }
            i--;
        }
        swapValuesOfArray(ar, i, right);
        return i;
    }
}