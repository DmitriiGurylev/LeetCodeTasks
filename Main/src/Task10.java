package src;

import java.util.*;
import java.util.stream.Collectors;

public class Task10 {

    public static void main (String[] args){

    }

    public String longestCommonPrefixVer1(String[] strs) {
        StringBuilder commonStr = new StringBuilder();

        int length = Arrays.stream(strs).mapToInt(String::length).min().orElse(0);
        if (length == 0) {return commonStr.toString();}

        for (int i=0; i<length; i++) {
           for (int j=0; j< strs.length-1;j++) {
               if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                   return commonStr.toString();
               }
           }
           commonStr.append(strs[0].charAt(i));
        }
        return commonStr.toString();
    }

}
