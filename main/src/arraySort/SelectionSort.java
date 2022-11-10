package src.arraySort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        selectionSortIncreasing(array);
        System.out.println(Arrays.toString(array));

    }

    public static void selectionSortIncreasing(int[] ar) {
        for (int i=0; i< ar.length; i++) {
            int min = ar[i];
            int index = i;
            for (int j=i; j< ar.length; j++) {
                    if (ar[j] < min) {
                        min = ar[j];
                        index = j;
                    }
            }
            int temp = ar[index];
            ar[index] = ar[i];
            ar[i] = temp;
        }
    }

}
