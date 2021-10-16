package src;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{
                0, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        int[] arrayRandom = new int[10000];
        for (int i=0; i<arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random()*10000);
        }

        System.out.println(Arrays.toString(insertionSortIncreasing(array)));
        System.out.println(Arrays.toString(selectionSortIncreasing(array)));
        System.out.println(Arrays.toString(mergeSortIncreasing(array)));
        System.out.println(Arrays.toString(quickSortIncreasing(array)));
        System.out.println(Arrays.toString(insertionSortDecreasing(array)));
        System.out.println(Arrays.toString(selectionSortDecreasing(array)));
        System.out.println();

        System.out.println(Arrays.toString(insertionSortIncreasing(arrayRandom)));
        System.out.println(Arrays.toString(selectionSortIncreasing(arrayRandom)));
        System.out.println(Arrays.toString(mergeSortIncreasing(arrayRandom)));
        System.out.println(Arrays.toString(quickSortIncreasing(arrayRandom)));
        System.out.println(Arrays.toString(insertionSortDecreasing(arrayRandom)));
        System.out.println(Arrays.toString(selectionSortDecreasing(arrayRandom)));
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
        return mergeSort(ar,0, ar.length-1);
    }
    public static int[] mergeSort(int[] ar, int p, int r) {
        if (p<r) {
            int q = p+(r-p)/2;
            mergeSort(ar,p,q);
            mergeSort(ar,q+1,r);
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

    public static int[] quickSortIncreasing(int[] ar) {
        return quickSort(ar,0, ar.length-1);
    }
    public static int[] quickSort(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex<lastIndex) {
            int part = partition(array, firstIndex, lastIndex);
            quickSort(array, firstIndex, part-1);
            quickSort(array, part, lastIndex);
        }
        return array;
    }
    public static int partition(int[] array,int first, int last) {
        int leftIndex = first;
        int rightIndex = last;

        int general = array[first+(last-first)/2];

        while (leftIndex <= rightIndex) {

            while (array[leftIndex] < general && leftIndex<=last) {
                leftIndex++;
            }

            while (array[rightIndex] > general && rightIndex>=first) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                if (array[leftIndex] != array[rightIndex]) {
                    int swapVar = array[leftIndex];
                    array[leftIndex] = array[rightIndex];
                    array[rightIndex] = swapVar;
                }
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}