package src;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};

        System.out.println(Arrays.toString(shakerSortIncreasing(array)));

        System.out.println(Arrays.toString(shakerSortDecreasing(array)));
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

}