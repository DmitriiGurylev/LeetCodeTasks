package src.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        System.out.println(Arrays.toString(insertionSortIncreasing(array)));

        System.out.println(Arrays.toString(insertionSortDecreasing(array)));
    }

    public static int[] insertionSortIncreasing(int[] ar) {
        for (int j = 1; j < ar.length; j++) {
            int i = j - 1; // i - итератор, с помощью которого определяется, больше ли число из отсортированного массива числа key
            int key = ar[j]; // key - число, которое нужно отсортировать на данной итерации
            while (i >= 0 && ar[i] > key) {
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = key;
        }
        return ar;
    }

    public static int[] insertionSortDecreasing(int[] ar) {
        for (int j = 1; j < ar.length; j++) {
            int key = ar[j];
            int i = j - 1;
            while (i >= 0 && ar[i] < key) {
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = key;
        }
        return ar;
    }

    public static int[] insertionSortIncreasingVer2(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        return insertionSortVer2(newAr, newAr.length-1);
    }
    public static int[] insertionSortVer2(int[] ar, int index) {
        if (index<=0) {
            return ar;
        }
        insertionSortVer2(ar, index-1);
        int key = ar[index];
        int i = index-1;
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
            endIndex = j;
            beginIndex = -1;
            while (endIndex - beginIndex > 1) {
                int middleIndex = beginIndex + (endIndex +1 - beginIndex) / 2;
                int middleValue = newAr[middleIndex];
                if (middleValue > key) {
                    endIndex = middleIndex;
                } else {
                    beginIndex = middleIndex;
                }
            }
            endIndex=j-1;

            while (endIndex > beginIndex) {
                newAr[endIndex+1] = newAr[endIndex];
                endIndex--;
            }
            newAr[beginIndex+1] = key;
        }
        return newAr;
    }

}