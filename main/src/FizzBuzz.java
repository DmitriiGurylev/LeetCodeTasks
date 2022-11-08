package src;

import java.util.ArrayList;
import java.util.List;

/**
* Given an integer n, return a string array answer (1-indexed) where
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
*
* https://leetcode.com/problems/fizz-buzz/
*
* */
public class FizzBuzz {
    public static void main(String[] args) {}

    public List<String> fizzBuzz(int n) {
        List<String> finalList = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.toString().equals("")) {
                sb.append(i);
            }
            finalList.add(sb.toString());
        }
        return finalList;
    }
}
