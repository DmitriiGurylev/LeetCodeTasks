package src;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4};
        System.out.println(Arrays.toString(mergeSortIncreasingVer1(array)));
        System.out.println(Arrays.toString(mergeSortIncreasingVer2(array)));
    }

    public static int[] mergeSortIncreasingVer1(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length); // создание нового массива
        return mergeSortVer1(newAr,0, ar.length-1);
    }
    public static int[] mergeSortVer1(int[] ar, int leftBorder, int rightBorder) {
        if (leftBorder<rightBorder) { // условие: левый индекс на данной итерации должен быть меньше, чем правый
            int q = leftBorder+(rightBorder-leftBorder)/2; // определение среднего индекса, по которому будет разбиваться на части массив (сам индекс относится к левому массиву)
            mergeSortVer1(ar,leftBorder,q); // рекурсивный вызов для левой части массива
            mergeSortVer1(ar,q+1,rightBorder); // рекурсивный вызов для правой части массива
            return mergeVer1(ar,leftBorder,q,rightBorder); // после того, как оба массива максимально разделились, идет их объединение
        }
        return ar;
    }
    public static int[] mergeVer1(int[] ar, int leftIndex, int middleIndex, int rightIndex) {
        int n1 = middleIndex-leftIndex+1; // емкость левого массива
        int n2 = rightIndex-middleIndex; // емкость правого массива
        int[] leftArray = new int[n1+1];
        int[] rightArray = new int[n2+1];

        // заполнение массивов
        for (int i=0; i<n1;i++) {
            leftArray[i] = ar[leftIndex+i];
        }
        for (int i=0; i<n2;i++) {
            rightArray[i] = ar[middleIndex+i+1];
        }

        leftArray[n1] = Integer.MAX_VALUE;
        rightArray[n2] = Integer.MAX_VALUE;

        int i=0, j=0;

        // сортировка массива на основе левой и правой части
        for (int k=leftIndex; k<rightIndex+1; k++) {
            if (leftArray[i] < rightArray[j]) {
                ar[k] = leftArray[i];
                i++;
            }
            else {
                ar[k] = rightArray[j];
                j++;
            }
        }
        return ar;
    }

    public static int[] mergeSortIncreasingVer2(int[] ar) {
        int[] newAr = Arrays.copyOf(ar,ar.length); // создание нового массива
        return mergeSortVer2(newAr,0, ar.length-1);
    }
    public static int[] mergeSortVer2(int[] ar, int leftBorder, int rightBorder) {
        if (leftBorder<rightBorder) { // условие: левый индекс на данной итерации должен быть меньше, чем правый
            int q = leftBorder+(rightBorder-leftBorder)/2; // определение среднего индекса, по которому будет разбиваться на части массив (сам индекс относится к левому массиву)
            mergeSortVer2(ar,leftBorder,q); // рекурсивный вызов для левой части массива
            mergeSortVer2(ar,q+1,rightBorder); // рекурсивный вызов для правой части массива
            return mergeNewVer2(ar,leftBorder,q,rightBorder); // после того, как оба массива максимально разделились, идет их объединение
        }
        return ar;
    }
    public static int[] mergeNewVer2(int[] ar, int leftIndex, int middleIndex, int rightIndex) {
        int n1 = middleIndex-leftIndex+1; // емкость левого массива
        int n2 = rightIndex-middleIndex; // емкость правого массива
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // заполнение массивов
        for (int i=0; i<n1;i++) {
            leftArray[i] = ar[leftIndex+i];
        }
        for (int i=0; i<n2;i++) {
            rightArray[i] = ar[middleIndex+i+1];
        }

        int iForLeftAr=0, jForRightAr=0;

        // сортировка массива на основе левой и правой части
        for (int k=leftIndex; k<rightIndex+1; k++) {
            if (iForLeftAr>=n1) {
                ar[k] = rightArray[jForRightAr];
                jForRightAr++;
            } else if (jForRightAr>=n2) {
                ar[k] = leftArray[iForLeftAr];
                iForLeftAr++;
            } else if (leftArray[iForLeftAr] < rightArray[jForRightAr]) {
                ar[k] = leftArray[iForLeftAr];
                iForLeftAr++;
            } else {
                ar[k] = rightArray[jForRightAr];
                jForRightAr++;
            }
        }
        return ar;
    }

}