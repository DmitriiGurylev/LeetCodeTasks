package src;

/* Given an array arr of positive integers sorted in a strictly increasing order,
 * and an integer k.
 *
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3594/
 */

class Task6 {
    public static void main (String[] args) {}
    public int findKthPositive(int[] arr, int k) {
        int i;
        int count = 0;
        for (i=1; i<Integer.MAX_VALUE; i++){

            boolean checkIfMatch = false;

            for (int j=0; j<arr.length; j++) {

                if (arr[j]==i) {
                    checkIfMatch = true;
                    break;
                }
            }

            if (!checkIfMatch)
                count++;
            if (k==count){
                return i;
            }
        }
        return i;
    }
}
