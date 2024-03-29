package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Search {
    public static void main(String[] args) {
        int[] array = new int[]{
                20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3,
                5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4, 6, 3, 7, 2, 1, 8, 9, 10};
        int[] sortedArray = mergeSortIncreasingVer2(array);
        Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());



        System.out.println(searchASumOfTwoIntegerOfTheSetVer1(set, 15));
        System.out.println(searchASumOfTwoIntegerOfTheSetVer1(set, 98));

        System.out.println(searchASumOfTwoIntegerOfTheSetVer2(set, 10)); // true
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

    public int search(int[] nums, int target) {
        return searchRec(nums, 0, nums.length-1, target);
    }

    private static int searchRec(int[] nums, int left, int right, int target) {
        if (left >= right ) {
            return target == nums[left] ? left : -1;
        }
        int middle = left + (right-left)/2;
        return target <= nums[middle] ?
                searchRec(nums, left, middle, target) :
                searchRec(nums, middle + 1, right, target);
    }

    public int searchWithWhile(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right) {
            int middle = left + (right-left)/2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle-1;
            } else {
                left = middle+1;
            }
        }
        return -1;
    }

    public static boolean searchASumOfTwoIntegerOfTheSetVer1(Set set, int value) {
        int[] array = new int[set.size()];
        for (int i=0; i<set.size(); i++) {
            array[i] = (int) set.toArray()[i];
        }
        int valueI, valueJ;
        for (int i=0; i<set.size()-1; i++) {
            valueI = array[i];
            for (int j=i+1; j<set.size(); j++) {
                valueJ = array[j];
                if (valueI+valueJ == value && valueI!=valueJ) {
                    return  true;
                }
            }
        }
        return false;
    }


    // TODO 2.3-7 isn't ready!!!!!! use only if integer of set are >= 0
    public static boolean searchASumOfTwoIntegerOfTheSetVer2(Set<Integer> set, int value) {
        List<Integer> listOfIntFirst = new ArrayList<>();
        List<Integer> listOfIntSecond = new ArrayList<>();
        for (int i=0; i<set.size(); i++) {
            listOfIntFirst.add((Integer) set.toArray()[i]);
        }

        listOfIntFirst = listOfIntFirst.stream().sorted().collect(Collectors.toList());
        listOfIntSecond = listOfIntFirst.stream().map(v -> value-v).sorted().collect(Collectors.toList());

        List<Integer> newList = IntStream.range(0, listOfIntFirst.size() + listOfIntSecond.size())
                .mapToObj(v -> 0)
                .collect(Collectors.toList());

        int i=0, j=0;
        int z=0;
        while (z< newList.size()) {

            if (j>=listOfIntSecond.size() || (i<listOfIntFirst.size() && listOfIntFirst.get(i)<=listOfIntSecond.get(j))) {
                newList.set(z,listOfIntFirst.get(i));
                i++;
            } else {
                newList.set(z,listOfIntSecond.get(j));
                j++;
            }
            z++;
        }
        return false;
    }

}
