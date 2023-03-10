package src;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        System.out.println(Arrays.toString(bubbleSortIncreasing(array)));

        System.out.println(Arrays.toString(bubbleSortDecreasing(array)));
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

}