package src;

public class KadanesAlgorithm {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, -1, -2, -5, 16};
        int[] arr2 = {1, -2, 0, 3};
        int[] arr3 = {3, -1, -1, 4, 3, -1};
        System.out.println(kadanesAlgorithm(arr1));
        System.out.println(kadanesAlgorithm(arr2));
        System.out.println(kadanesAlgorithm(arr3));
    }


    private static int kadanesAlgorithm(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int nowSum=0;

        for (int j : array) {
            nowSum += j;
            if (nowSum < 0) {
                nowSum = 0;
            }
            if (maxSum < nowSum) {
                maxSum = nowSum;
            }
        }
        return maxSum;
    }
}
