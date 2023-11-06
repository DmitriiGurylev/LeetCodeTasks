package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.FizzBuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
public class FizzBuzzTest {
    @Test
    public void test() {
        Assertions.assertEquals(FizzBuzz.fizzBuzz(0), new LinkedList<>());
        Assertions.assertEquals(
                FizzBuzz.fizzBuzz(15),
                List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
        );
    }
}
