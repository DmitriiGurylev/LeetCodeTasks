package src;

import java.util.*;

public class Task9 {

    public static void main (String[] args){
        int[] arr = {3,2,1,2};
        System.out.println(thirdMax(arr));
        System.out.println(findDisappearedNumbers(arr));

    }

    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int value : nums) {
            set.add(value);
        }
        if (set.size()<3){
            return set.stream().max(Comparator.comparingInt(Integer :: valueOf)).get();
        }
        else{
            set.remove(set.stream().max(Comparator.comparingInt(Integer :: valueOf)).get());
            set.remove(set.stream().max(Comparator.comparingInt(Integer :: valueOf)).get());
            return set.stream().max(Comparator.comparingInt(Integer :: valueOf)).get();
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int l = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int v : nums){
            set.add(v);
        }
        for (int i=0; i<l; i++) {
            if (!set.contains(i+1)) {
                list.add(i+1);
            }
        }
        return list;
    }

    public int[] sortedSquares(int[] nums) {
        for (int i=0; i< nums.length; i++){
            nums[i] *= nums[i];
        }
        int r=0, w=0;

        Arrays.sort(nums);

        return nums;
    }
}
