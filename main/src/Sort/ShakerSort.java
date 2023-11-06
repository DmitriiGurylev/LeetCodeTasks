package src.Sort;

import static src.Helpers.swapValuesOfArray;

public class ShakerSort {

    public static int[] shakerSortIncreasing(int[] ar) {
        int left = 0;
        int right = ar.length - 1;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = left; i < right; i++) {
                if (ar[i] > ar[i + 1]) {
                    swapValuesOfArray(ar, i, i+1);
                    swapped = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (ar[i] < ar[i - 1]) {
                    swapValuesOfArray(ar, i, i-1);
                    swapped = true;
                }
            }
            left++;
        }
        return ar;
    }

    public static int[] shakerSortDecreasing(int[] ar) {
        int left = 0;
        int right = ar.length - 1;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = left; i < right; i++) {
                if (ar[i] < ar[i + 1]) {
                    swapValuesOfArray(ar, i, i+1);
                    swapped = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (ar[i] > ar[i - 1]) {
                    swapValuesOfArray(ar, i, i-1);
                    swapped = true;
                }
            }
            left++;
        }
        return ar;
    }
}