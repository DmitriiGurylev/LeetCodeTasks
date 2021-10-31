package src;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        System.out.println(Arrays.toString(bubbleSortIncreasing(array)));
        System.out.println(Arrays.toString(shakerSortIncreasing(array)));
        System.out.println(Arrays.toString(insertionSortIncreasing(array)));
        System.out.println(Arrays.toString(selectionSortIncreasing(array)));
        System.out.println(Arrays.toString(mergeSortIncreasing(array)));
        System.out.println(Arrays.toString(quickSortIncreasing(array)));

        System.out.println(Arrays.toString(bubbleSortDecreasing(array)));
        System.out.println(Arrays.toString(shakerSortDecreasing(array)));
        System.out.println(Arrays.toString(insertionSortDecreasing(array)));
        System.out.println(Arrays.toString(selectionSortDecreasing(array)));
    }

    public static int[] bubbleSortIncreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        int tr;
        boolean innerCycle=true;
        int i=0;
        while (innerCycle) {
            innerCycle=false;
            for (int j = 1; j < newAr.length-i; j++) {
                if (newAr[j-1] > newAr[j]) {
                    innerCycle = true;
                    tr = newAr[j];
                    newAr[j] = newAr[j-1];
                    newAr[j-1] = tr;
                }
            }
            i++;
        }
        return newAr;
    }

    public static int[] bubbleSortDecreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        int tr;
        boolean innerCycle=true;
        int i=0;
        while (innerCycle) {
            innerCycle=false;
            for (int j = newAr.length-1; j > i; j--) {
                if (newAr[j - 1] < newAr[j]) {
                    innerCycle = true;
                    tr = newAr[j];
                    newAr[j] = newAr[j - 1];
                    newAr[j - 1] = tr;
                }
            }
            i++;
        }
        return newAr;
    }

    public static int[] shakerSortIncreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        if (newAr.length<=1) {
            return newAr;
        }
        int left = 0;
        int right = newAr.length;
        boolean b = true;
        int begin = left - 1;
        int end = right - 1;
        while (b) {
            b = false;
            begin++;
            for (int i = begin; i < end; i++) {
                if (newAr[i] > newAr[i+1]) {
                    int tr = newAr[i];
                    newAr[i] = newAr[i+1];
                    newAr[i+1] = tr;
                    b = true;
                }
            }
            if (!b) {
                break;
            }
            end--;
            for (int i = end; i > begin; i--) {
                if (newAr[i] < newAr[i-1]) {
                    int tr = newAr[i];
                    newAr[i] = newAr[i-1];
                    newAr[i-1] = tr;
                    b = true;
                }
            }
        }
        return newAr;
    }

    public static int[] shakerSortDecreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        if (newAr.length<=1) {
            return newAr;
        }
        int left = 0;
        int right = newAr.length;
        boolean b = true;
        int begin = left - 1;
        int end = right - 1;
        while (b) {
            b = false;
            begin++;
            for (int i = begin; i < end; i++) {
                if (newAr[i] < newAr[i+1]) {
                    int tr = newAr[i];
                    newAr[i] = newAr[i+1];
                    newAr[i+1] = tr;
                    b = true;
                }
            }
            if (!b) {
                break;
            }
            end--;
            for (int i = end; i > begin; i--) {
                if (newAr[i] > newAr[i-1]) {
                    int tr = newAr[i];
                    newAr[i] = newAr[i-1];
                    newAr[i-1] = tr;
                    b = true;
                }
            }
        }
        return newAr;
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

    public static int[] mergeSortIncreasing(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length);
        return mergeSort(newAr,0, ar.length-1);
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
        int[] newAr = Arrays.copyOf(ar,ar.length);
        return quickSort(newAr,0, ar.length-1);
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

        // int divider = array[first+(last-first)/2];
        int divider = array[first];

        while (leftIndex <= rightIndex) {

            while (array[leftIndex] < divider && leftIndex<=last) {
                leftIndex++;
            }
            while (array[rightIndex] > divider && rightIndex>=first) {
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