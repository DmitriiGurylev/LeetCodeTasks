package src;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        System.out.println(Arrays.toString(insertionSortIncreasingVer1(array)));
        System.out.println(Arrays.toString(insertionSortDecreasingVer1(array)));
        System.out.println(Arrays.toString(insertionSortIncreasingVer2(array)));
        System.out.println(Arrays.toString(insertionSortIncreasingVer3(array)));
    }

    public static int[] insertionSortIncreasingVer1(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        int key, endIndex; // key - число, которое нужно отсортировать на данной итерации; endIndex - итератор, с помощью которого определяется, больше ли число из отсортированного массива числа key
        for (int j = 1; j < newAr.length; j++) {
            key = newAr[j];
            endIndex = j - 1;
            while (endIndex >= 0 && newAr[endIndex] > key) {
                newAr[endIndex + 1] = newAr[endIndex];
                endIndex--;
            }
            newAr[endIndex + 1] = key;
        }
        return newAr;
    }
    public static int[] insertionSortDecreasingVer1(int[] ar) {
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

    public static int[] insertionSortIncreasingVer2(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        return insertionSortVer2(newAr, newAr.length-1);
    }
    public static int[] insertionSortVer2(int[] ar, int index) {
        if (index<=1) {
            return ar;
        }
        insertionSortVer2(ar, index-1);
        int key,i;
        key = ar[index];
        i = index-1;
        while (i >= 0 && ar[i] > key) {
            ar[i + 1] = ar[i];
            i--;
        }
        ar[i + 1] = key;
        return ar;
    }


    public static int[] insertionSortIncreasingVer3(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        int key, endIndex, beginIndex; // key - число, которое нужно отсортировать на данной итерации; endIndex - итератор, с помощью которого определяется, больше ли число из отсортированного массива числа key
        for (int j = 1; j < newAr.length; j++) {
            key = newAr[j];
            endIndex = j - 1;
            beginIndex = 0;
            while (endIndex - beginIndex >) {
                newAr[endIndex + 1] = newAr[endIndex];
                endIndex--;
            }
            newAr[endIndex + 1] = key;
        }
        return newAr;
    }
}