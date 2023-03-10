package src;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        System.out.println(Arrays.toString(selectionSortIncreasing(array)));

        System.out.println(Arrays.toString(selectionSortDecreasing(array)));
    }

    public static int[] selectionSortIncreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        int min, index;
        for (int i = 0; i < newAr.length-1; i++) {
            min = newAr[i];
            index = i;
            for (int j = i + 1; j < newAr.length; j++) {
                if (newAr[j] < min) {
                    min = newAr[j];
                    index = j;
                }
            }
            newAr[index] = newAr[i];
            newAr[i] = min;
        }
        return newAr;
    }

    public static int[] selectionSortDecreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        int max, index;
        for (int i = 0; i < newAr.length-1; i++) {
            max = newAr[i];
            index = i;
            for (int j = i + 1; j < newAr.length; j++) {
                if (newAr[j] > max) {
                    max = newAr[j];
                    index = j;
                }
            }
            newAr[index] = newAr[i];
            newAr[i] = max;
        }
        return newAr;
    }

}