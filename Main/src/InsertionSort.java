package src;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1,2,6,9,176,4,3,98,56,3,16,9,54,2,1,0,6,5,0,4,2};
        System.out.println(Arrays.toString(sortIncreasing(array)));
        System.out.println(Arrays.toString(sortDecreasing(array)));
    }

    public static int[] sortIncreasing(int[] ar) {
        int key,i; // key - число, которое нужно отсортировать на данной итерации; i - итератор, с помощью которого определяется, больше ли число из отсортированного массива числа key
        for (int j=1; j< ar.length; j++) {
            key = ar[j];
            i = j-1;
            while (i>=0 && ar[i]>key) {
                ar[i+1] = ar[i];
                i--;
            }
            ar[i+1] = key;
        }
        return ar;
    }
    public static int[] sortDecreasing(int[] ar) {
        int key,i;
        for (int j=1; j< ar.length; j++) {
            key = ar[j];
            i = j-1;
            while (i>=0 && ar[i]<key) {
                ar[i+1] = ar[i];
                i--;
            }
            ar[i+1] = key;
        }
        return ar;
    }
}