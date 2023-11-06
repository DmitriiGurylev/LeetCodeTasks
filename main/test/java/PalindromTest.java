package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Palindrom;

public class PalindromTest {
    @Test
    public void test() {
        Assertions.assertTrue(Palindrom.isPalindrom(123454321));
        Assertions.assertTrue(Palindrom.isPalindrom(12344321));
        Assertions.assertTrue(Palindrom.isPalindrom("asdffdsa"));
        Assertions.assertTrue(Palindrom.isPalindrom("asdfnfdsa"));

        Assertions.assertFalse(Palindrom.isPalindrom(12345432));
        Assertions.assertFalse(Palindrom.isPalindrom(1234432));
        Assertions.assertFalse(Palindrom.isPalindrom("asdffds"));
        Assertions.assertFalse(Palindrom.isPalindrom("asdfnfds"));

        Assertions.assertTrue(Palindrom.isPalindromUpdated("A man, a plan, a canal: Panama"));
        Assertions.assertTrue(Palindrom.isPalindromUpdated("asdfnfdsa"));
        Assertions.assertFalse(Palindrom.isPalindromUpdated("asdfnfds"));

        Assertions.assertEquals(Palindrom.findMaxPalindorm("uiopasddsaasddsapoiuhhh"), "uiopasddsaasddsapoiu");
        Assertions.assertEquals(Palindrom.findMaxPalindorm("uiopasddsasddsapoiuhhh"), "uiopasddsasddsapoiu");
    }
}
