package src;

import java.util.Arrays;

public class Task15_quickSort {
    public static void main(String[] args) {

        int[] firstArray = new int[]{
                0, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};
        System.out.println(Arrays.toString(firstArray));
        //rapidSort(firstArray,0,firstArray.length-1);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[]{5, 4, 2, 7, 22, 5};
        System.out.println(Arrays.toString(firstArray));
        rapidSort(secondArray,0,secondArray.length-1);
        System.out.println(Arrays.toString(secondArray));

    }

    public static void rapidSort(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex<lastIndex) {
            int part = partition(array, firstIndex, lastIndex);
            rapidSort(array, firstIndex, part-1);
            rapidSort(array, part, lastIndex);
        }
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
                System.out.println();
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