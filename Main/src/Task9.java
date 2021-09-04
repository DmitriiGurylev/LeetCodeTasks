package src;

import java.util.*;

public class Task9 {

    public static void main (String[] args){
        int[] arr = {3,2,1};
        System.out.println(thirdMax(arr));

    }

    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int value : nums) {
            if (!set.contains(value)){
                set.add(value);
            }
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
}
