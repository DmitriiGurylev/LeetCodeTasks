package src;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        System.out.println(Arrays.toString(insertionSortIncreasing(array)));

        System.out.println(Arrays.toString(insertionSortDecreasing(array)));
    }

    public static int[] insertionSortIncreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        int key, i; // key - число, которое нужно отсортировать на данной итерации; i - итератор, с помощью которого определяется, больше ли число из отсортированного массива числа key
        for (int j = 1; j < newAr.length; j++) {
            key = newAr[j];
            i = j - 1;
            while (i >= 0 && newAr[i] > key) {
                newAr[i + 1] = newAr[i];
                i--;
            }
            newAr[i + 1] = key;
        }
        return newAr;
    }

    public static int[] insertionSortDecreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        int key, i;
        for (int j = 1; j < newAr.length; j++) {
            key = newAr[j];
            i = j - 1;
            while (i >= 0 && newAr[i] < key) {
                newAr[i + 1] = newAr[i];
                i--;
            }
            newAr[i + 1] = key;
        }
        return newAr;
    }

}