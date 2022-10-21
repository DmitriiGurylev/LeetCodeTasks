package src;

public class Task18 {
    public static void main (String[] args){
        System.out.println(new Task18().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        for (int left=0 ; left< nums.length; left++) {
            int sumNow = 0;
            int right=left;
            int lengthNow = 0;
            while (right<nums.length && sumNow<target) {
                if (left != right) {
                    sumNow+=nums[right];
                } else {
                    sumNow=nums[left];
                }
                lengthNow++;
                right++;
            }
            if (minLength>lengthNow && sumNow>=target) {
                minLength = lengthNow;
            }
        }
        return minLength==Integer.MAX_VALUE ? 0 : minLength;
    }
}
