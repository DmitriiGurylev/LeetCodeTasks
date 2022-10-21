package src;

public class KadanesAlgorithm {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, -1, -2, -5, 16};
        int[] arr2 = {1, -2, 0, 3};
        int[] arr3 = {3, -1, -1, 4, 3, -1};
        int[] arr4 = {-16, -15, -14, -13, -12, -11};

        System.out.println(kadanesAlgorithm(arr1));
        System.out.println(kadanesAlgorithm(arr2));
        System.out.println(kadanesAlgorithm(arr3));
        System.out.println(kadanesAlgorithm(arr4));
    }


    private static int kadanesAlgorithm(int[] array) {
        if (array.length==0) {
            return 0;
        }
        boolean flagIfAllNegative = true;
        int maxValue = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i]>0) {
                flagIfAllNegative=false;
                break;
            }
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        if (flagIfAllNegative) {
            return maxValue;
        }

        int maxSum = Integer.MIN_VALUE;
        int nowSum=array[0];

        for (int i = 1; i < array.length; i++) {
            nowSum += array[i];
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
