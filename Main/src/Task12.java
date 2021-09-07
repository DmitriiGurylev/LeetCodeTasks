//package src;//package src;
//
//import java.math.BigInteger;
//import java.util.*;
//
//public class Task10 {
//
//    public static void main (String[] args){
//        System.out.println(generate(5));
//    }
//
//    public static List<List<Integer>> generate(int numRows) {
//        List <List<Integer> > pascalTriangle = new LinkedList<>();
//        Integer[][] externalArray = new Integer[numRows][];
//
//        for (int i=0; i<numRows; i++){
//            Integer[] innerArray = new Integer[i+1];
//            externalArray[i] = innerArray;
//
//            innerArray[0]=1;
//            innerArray[innerArray.length-1]=1;
//
//            for (int j=1; j< innerArray.length-1; j++){
//                innerArray[j] = externalArray[i-1][j-1] + externalArray[i-1][j];
//            }
//            pascalTriangle.add(Arrays.asList(innerArray));
//        }
//        return pascalTriangle;
//    }
//
//    public String addBinary(String a, String b) {
//        return (new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2));
//    }
//
//    public int strStr(String haystack, String needle) {
//        return (haystack.contains(needle)) ? haystack.indexOf(needle) : -1 ;
//    }
//}
