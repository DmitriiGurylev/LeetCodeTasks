package src;

import java.util.Arrays;

public class Task17 {
    public static void main (String[] args){
        System.out.println(new Task17().findMaxConsecutiveOnes(new int[]{1,0,1,1,1,1,1,0,1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int onesMax = 0;
        int onesNow = 0;
        for (int num : nums) {
            if (num == 1) {
                onesNow++;
            } else {
                if (onesNow > onesMax) {
                    onesMax = onesNow;
                }
                onesNow = 0;
            }
        }
        if (onesNow>onesMax) {
            onesMax=onesNow;
        }
        return onesMax;
    }
}
