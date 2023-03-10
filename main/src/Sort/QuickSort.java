package src;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        System.out.println(Arrays.toString(mergeSortIncreasing(array)));
        System.out.println(Arrays.toString(quickSortIncreasing(array)));

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