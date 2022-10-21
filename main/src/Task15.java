package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task15 {
    public static void main (String[] args){
        System.out.println(new Task15().arrayPairSum(new int[]{1, 5, 2, 3, 1,3}));
    }

    public int arrayPairSum(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        int maximazed = 0;
        int[][] pairs = new int[nums.length/2][2];

        for (int i=0; i< nums.length; i++) {
            pairs[i / 2][i % 2] = nums[i];
            if (i % 2 == 1) {
                maximazed += Math.min(pairs[i][0], pairs[i][1]);
            }
        }
        return maximazed;
    }
}
