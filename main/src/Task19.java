package src;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,4,5,2,1,2,5};
        new Task19().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{-1};
        new Task19().rotate(nums, 2);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1,2};
        new Task19().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        if (k==nums.length || nums.length<=1) {
            return;
        } else if (k> nums.length) {
            k = k % nums.length;
        }
        int[] first = new int[nums.length - k];
        int[] second = new int[k];

        System.arraycopy(nums, 0, first, 0, first.length);
        System.arraycopy(nums, nums.length - k, second, 0, k);

        for (int i=0; i<nums.length; i++) {
            nums[i] = i < k ?
                    second[i] :
                    first[i - k];
        }
    }
}

