package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task13 {
    public static void main(String[] args) {

        int[] firstArray = new int[]{0,4,5,2,6,9,2,5,7,1,5,9,5,3,0,6,4,1,43,64,1,6,7,3,4,5,9,2};
        int[] array = Arrays.stream(firstArray).sorted().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(twoSum(new int[]{5,25,75}, 100)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while (left<right) {
            if (numbers[left]+numbers[right] == target) {
                return new int[]{left+1, right+1};
            }
            else if (numbers[left]+numbers[right] < target) {
                left++;
            }
            else if (numbers[left]+numbers[right] > target) {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}