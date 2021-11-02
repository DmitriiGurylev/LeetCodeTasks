package src;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4, 6, 3, 7, 2, 1, 8, 9, 10};
        int[] sortedArray = mergeSortIncreasingVer2(array);

        System.out.println(binarySearchRecursiveVer1(sortedArray, 31)); // true
        System.out.println(binarySearchRecursiveVer1(sortedArray, 32)); // false
        System.out.println(binarySearchRecursiveVer1(sortedArray, 10)); // true
        System.out.println(binarySearchRecursiveVer1(sortedArray, 777)); // false

        System.out.println(binarySearchIterativeVer1(sortedArray, 31)); // true
        System.out.println(binarySearchIterativeVer1(sortedArray, 32)); // false
        System.out.println(binarySearchIterativeVer1(sortedArray, 10)); // true
        System.out.println(binarySearchIterativeVer1(sortedArray, 777)); // false


    }

    public static int[] mergeSortIncreasingVer2(int[] ar) {
        int[] newAr = Arrays.copyOf(ar, ar.length); // создание нового массива
        return mergeSortVer2(newAr, 0, ar.length - 1);
    }

    public static int[] mergeSortVer2(int[] ar, int leftBorder, int rightBorder) {
        if (leftBorder < rightBorder) { // условие: левый индекс на данной итерации должен быть меньше, чем правый
            int q = leftBorder + (rightBorder - leftBorder) / 2; // определение среднего индекса, по которому будет разбиваться на части массив (сам индекс относится к левому массиву)
            mergeSortVer2(ar, leftBorder, q); // рекурсивный вызов для левой части массива
            mergeSortVer2(ar, q + 1, rightBorder); // рекурсивный вызов для правой части массива
            return mergeNewVer2(ar, leftBorder, q, rightBorder); // после того, как оба массива максимально разделились, идет их объединение
        }
        return ar;
    }

    public static int[] mergeNewVer2(int[] ar, int leftIndex, int middleIndex, int rightIndex) {
        int n1 = middleIndex - leftIndex + 1; // емкость левого массива
        int n2 = rightIndex - middleIndex; // емкость правого массива
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // заполнение массивов
        for (int i = 0; i < n1; i++) {
            leftArray[i] = ar[leftIndex + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = ar[middleIndex + i + 1];
        }

        int iForLeftAr = 0, jForRightAr = 0;

        // сортировка массива на основе левой и правой части
        for (int k = leftIndex; k < rightIndex + 1; k++) {
            if (iForLeftAr >= n1) {
                ar[k] = rightArray[jForRightAr];
                jForRightAr++;
            } else if (jForRightAr >= n2) {
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

    public static boolean binarySearchRecursiveVer1(int[] ar, int value) {
        return binarySearchRec(ar, 0, ar.length - 1, value);
    }

    public static boolean binarySearchRec(int[] ar, int beginIndex, int endIndex, int value) {
        if (beginIndex == endIndex) {
            return ar[beginIndex] == value;
        }
        int middleIndex = beginIndex + (endIndex + 1 - beginIndex) / 2;
        int middleValue = ar[middleIndex];
        if (middleValue > value) {
            return binarySearchRec(ar, beginIndex, middleIndex - 1, value);
        } else {
            return binarySearchRec(ar, middleIndex, endIndex, value);
        }


    }

    public static boolean binarySearchIterativeVer1(int[] ar, int value) {
        int[] newAr = Arrays.copyOf(ar, ar.length);
        int beginIndex = 0;
        int endIndex = ar.length - 1;
        while (endIndex > beginIndex) {
            int middleIndex = beginIndex + (endIndex - beginIndex) / 2;
            int middleValue = ar[middleIndex];
            if (middleValue > value) {
                endIndex = middleIndex - 1;
            } else if (middleValue < value) {
                beginIndex = middleIndex + 1;
            } else {
                return true;
            }
        }
        return ar[beginIndex] == value;
    }
}