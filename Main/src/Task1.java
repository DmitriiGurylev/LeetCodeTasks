package src;

/*
* You are given an array of distinct integers arr and an array of integer arrays pieces,
* where the integers in pieces are distinct.
* Your goal is to form arr by concatenating the arrays in pieces in any order.
* However, you are not allowed to reorder the integers in each array pieces[i].
Return true if it is possible to form the array arr from pieces.
* Otherwise, return false.
*
* https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3589/
*
* */
public class Task1 {
    public static void main(String[] args) {}

    public boolean canFormArray(int[] arr, int[][] pieces) {
        boolean checker=false;
        for (int[] newArr : pieces) {
            checker=false;
            int count=0;
            for (int i=0; i<arr.length-newArr.length+1; i++){
                if (arr[i]==newArr[0]){
                    count++;
                    if (newArr.length==1) {
                        checker=true;
                        break;
                    }
                    else{
                        for (int j=1; j<newArr.length; j++){
                            if (newArr[j]==arr[i+j]){
                                count++;
                            }
                            else{
                                count=0;
                                checker=false;
                                break;
                            }
                        }
                    }
                    if (count == newArr.length){
                        checker = true;
                        break;
                    }
                }
            }
            if (!checker)
                break;
        }
        return checker;
    }
}
