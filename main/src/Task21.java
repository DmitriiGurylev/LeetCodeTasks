package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task21 {
    public static void main(String[] args) {
        System.out.println(new Task21().reverseWords("a b c d     e f"));
        System.out.println(new Task21().reverseWords("  hello world  "));
    }



    public String reverseWords(String s) {
        String[] reverseStringArray = Arrays.stream(s.split("\\s+"))
                .filter(subStr -> !subStr.equals(""))
                .toArray(String[]::new);
        StringBuilder returnString = new StringBuilder();

        for (int i = reverseStringArray.length-1; i>=0; i--) {
            returnString.append(reverseStringArray[i]);
            if (i != 0) {
                returnString.append(" ");
            }
        }
        return returnString.toString();
    }
}

