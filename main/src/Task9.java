package src;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task9 {

    public static void main (String[] args){
        int[] arr1 = {7,4,5,6,4,2,1,4,6,5,4,8,3,1,8,2,7,6,3,2};
        int[] arr2 = {3,2,1};
        int[] arr3 = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(thirdMax(arr3));
        System.out.println(findDisappearedNumbers(arr3));
        System.out.println(Arrays.toString(plusOne(arr3)));
        System.out.println(removeElement(arr3,7));
    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> list = IntStream.range(0, nums.length)
                .filter(i -> nums[i] != val)
                .mapToObj(i -> nums[i])
                .collect(Collectors.toList());
        IntStream.range(0, list.size()).forEach(i -> nums[i] = list.get(i));
        return list.size();
    }

    public static int heightChecker(int[] heights) {
        int[] arrNew = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arrNew);
        int indexes=0;
        for (int i=0; i<heights.length; i++){
            if (heights[i]!=arrNew[i]){
                indexes++;
            }
        }
        return indexes;
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

    public static int[] plusOne(int[] digits) {
        String str = "";
        for (int value : digits){
            str = str + value;
        }
        String newStr = "";
        if (str.charAt(str.length()-1) != '9'){
            for (int i=0; i<str.length()-1; i++){
                newStr += str.charAt(i);
            }
            newStr += Integer.parseInt(str.substring(str.length()-1)) + 1;
        }
        else{
            boolean сharNotNine = false;
            int index=0;
            for (int i=str.length()-1; i>=0; i--){
                if (str.charAt(i) !='9'){
                    сharNotNine = true;
                    index = i;
                    break;
                }
            }
            if (!сharNotNine){
                newStr += 1;
                for (int i=0; i<str.length(); i++){
                    newStr += 0;
                }
            }
            else{
                for (int i=0; i<index; i++){
                    newStr += str.charAt(i);
                }
                newStr += Integer.parseInt(str.substring(index,index+1)) + 1;
                for (int i=index+1; i<str.length(); i++){
                    newStr += 0;
                }
            }
        }
        int[] arrNew = new int[newStr.length()];
        for (int i=0; i< arrNew.length; i++){
            arrNew[i] = Integer.parseInt(newStr.substring(i,i+1));
        }
        return arrNew;
    }

    public static int[] sortArrayByParity(int[] nums) {
        int w=0;
        int r=0;
        int var;
        if (nums.length < 2){
            return nums;
        }
        for (int i=0; i<nums.length; i++){
            if (nums[w]%2 == 0){
                w++;
                r++;
            }
            else if (r != w && nums[r]%2 == 0){
                var = nums[w];
                nums[w]=nums[r];
                nums[r]=var;
                w++;
                r++;
            }
            else{
                r++;
            }
        }
        return nums;
    }
}
