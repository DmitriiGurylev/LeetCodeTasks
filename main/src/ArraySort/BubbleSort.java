package src.ArraySort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        bubbleSortIncreasing(array);
        System.out.println(Arrays.toString(array));

        bubbleSortDecreasing(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSortIncreasing(int[] ar) {
        for (int i=0; i < ar.length; i++) {
            int lastIndex = ar.length-1-i;
            for (int j=0; j < lastIndex; j++) {
                if (ar[j] > ar[j+1]) {
                    swapValues(ar, j, j+1);
                }
            }
        }
    }

    public static void bubbleSortDecreasing(int[] ar) {
        for (int i=0; i < ar.length; i++) {
            int lastIndex = ar.length-1-i;
            for (int j=0; j < lastIndex; j++) {
                if (ar[j] < ar[j+1]) {
                    swapValues(ar, j, j+1);
                }
            }
        }
    }

    private static void swapValues(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
