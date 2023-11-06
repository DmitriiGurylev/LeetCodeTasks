package src.Sort;


public class MergeSort {

    public static int[] mergeSortIncreasing(int[] ar) {
        divideAndMerge(ar, 0, ar.length-1, true);
        return ar;
    }

    public static int[] mergeSortDecreasing(int[] ar) {
        divideAndMerge(ar, 0, ar.length-1, false);
        return ar;
    }

    private static void divideAndMerge(int[] ar, int l, int r, boolean isIncreasing) {
        if (l < r) { // условие: левый индекс на данной итерации должен быть меньше, чем правый
            int m = (r - l) / 2 + l; // определение среднего индекса, по которому будет разбиваться на части массив (сам индекс относится к левому массиву)
            divideAndMerge(ar, l, m, isIncreasing); // рекурсивный вызов для левой части массива
            divideAndMerge(ar, m+1, r, isIncreasing); // рекурсивный вызов для правой части массива
            merge(ar, l, m, r, isIncreasing); // объединение массивов
        }
    }

    private static void merge(int[] ar, int l, int m, int r, boolean isIncreasing) {
        int lArrSize = m - l + 1; // емкость левого массива
        int rArrSize = r - m; // емкость правого массива

        // заполнение массивов
        int[] lArr = new int[lArrSize];
        int[] rArr = new int[rArrSize];
        System.arraycopy(ar, l, lArr, 0, lArrSize);
        System.arraycopy(ar, m+1, rArr, 0, rArrSize);

        int lInd = 0;
        int rInd = 0;
        // сортировка массива на основе уже отсортированных левой и правой части
        for (int k=l; k<r+1; k++) {
            if (lInd >= lArrSize) {
                ar[k] = rArr[rInd];
                rInd++;
            } else if (rInd >= rArrSize) {
                ar[k] = lArr[lInd];
                lInd++;
            } else if (isIncreasing) {
                if (lArr[lInd] > rArr[rInd]) {
                    ar[k] = rArr[rInd];
                    rInd++;
                } else {
                    ar[k] = lArr[lInd];
                    lInd++;
                }
            } else {
                if (lArr[lInd] < rArr[rInd]) {
                    ar[k] = rArr[rInd];
                    rInd++;
                } else {
                    ar[k] = lArr[lInd];
                    lInd++;
                }
            }
        }
    }
}