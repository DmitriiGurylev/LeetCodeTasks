package src;

import java.util.Arrays;
import java.util.stream.IntStream;

/***
 * @return массив чисел, в которых нет дубликатов.
 * Порядок чисел в оригинальном массиве должен быть сохранён.
 * Из дубликатов нужно оставлять последний элемент,
 * например, для {2,1,4,2,3} правильное решение - {1,4,2,3}, а не {2,1,4,3}
 * public static long[] deleteDuplicates(long[] a)
 */

public class Task16_removeFirstDuplicates {
    public static void main(String[] args) {

        long[] firstArray = new long[]{0,4,5,2,6,9,2,5,7,1,5,9,5,3,0,6,4,1,43,64,1,6,7,3,4,5,9,2};
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(deleteDuplicates(firstArray)));

    }

    public static long[] deleteDuplicates(long[] a) {
        long[] b = IntStream.range(0, a.length)
                .mapToLong(el -> a[a.length-el-1])
                .distinct()
                .toArray();
        return IntStream.range(0, b.length)
                .mapToLong(el -> b[b.length-el-1])
                .toArray();
    }

}