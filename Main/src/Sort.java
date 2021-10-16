package src;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 9, 176, 4, 3, 98, 56, 3, 16, 9, 54, 2, 1, 0, 6, 5, 0, 4, 2};
        System.out.println(Arrays.toString(insertionSortIncreasing(array)));
        System.out.println(Arrays.toString(insertionSortDecreasing(array)));
        System.out.println(Arrays.toString(selectionSortIncreasing(array)));
        System.out.println(Arrays.toString(selectionSortDecreasing(array)));
        System.out.println(Arrays.toString(mergeSortIncreasing(array)));
    }

    public static int[] insertionSortIncreasing(int[] ar) {
        int key, i; // key - число, которое нужно отсортировать на данной итерации; i - итератор, с помощью которого определяется, больше ли число из отсортированного массива числа key
        for (int j = 1; j < ar.length; j++) {
            key = ar[j];
            i = j - 1;
            while (i >= 0 && ar[i] > key) {
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = key;
        }
        return ar;
    }

    public static int[] insertionSortDecreasing(int[] ar) {
        int key, i;
        for (int j = 1; j < ar.length; j++) {
            key = ar[j];
            i = j - 1;
            while (i >= 0 && ar[i] < key) {
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = key;
        }
        return ar;
    }

    public static int[] selectionSortIncreasing(int[] ar) {
        int min, index;
        for (int i = 0; i < ar.length-1; i++) {
            min = ar[i];
            index = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < min) {
                    min = ar[j];
                    index = j;
                }
            }
            ar[index] = ar[i];
            ar[i] = min;
        }
        return ar;
    }

    public static int[] selectionSortDecreasing(int[] ar) {
        int max, index;
        for (int i = 0; i < ar.length-1; i++) {
            max = ar[i];
            index = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] > max) {
                    max = ar[j];
                    index = j;
                }
            }
            ar[index] = ar[i];
            ar[i] = max;
        }
        return ar;
    }

    public static int[] mergeSortIncreasing(int[] ar) {
        return merge_sort(ar,0, ar.length-1);
    }
    public static int[] merge_sort(int[] ar, int p, int r) {
        if (p<r) {
            int q = p+(r-p)/2;
            merge_sort(ar,p,q);
            merge_sort(ar,q+1,r);
            return merge(ar,p,q,r);
        }
        return ar;
    }
    public static int[] merge(int[] ar, int p, int q, int r) {
        int n1 = q-p+1;
        int n2 = r-q;
        int[] lAr = new int[n1+1];
        int[] rAr = new int[n2+1];

        for (int i=0; i<n1;i++) {
            lAr[i] = ar[p+i];
        }
        for (int i=0; i<n2;i++) {
            rAr[i] = ar[q+i+1];
        }

        lAr[n1] = Integer.MAX_VALUE;
        rAr[n2] = Integer.MAX_VALUE;

        int i=0, j=0;

        for (int k=p; k<r+1; k++) {
            if (lAr[i] < rAr[j]) {
                ar[k] = lAr[i];
                i++;
            }
            else {
                ar[k] = rAr[j];
                j++;
            }
        }
        return ar;
    }


}