package src;

public class Palindrom {

    public static boolean isPalindrom(int intValue) {
        if (intValue < 0) {
            return false;
        }
        return intValue == getReverseInt(intValue);
    }

    private static int getReverseInt(int v) {
        int revVal = 0;
        while (v != 0) {
            revVal = revVal * 10 + v % 10;
            v = v / 10;
        }
        return revVal;
    }

    public static boolean isPalindrom(String strValue) {
        int left = 0;
        int right = strValue.length()-1;

        for (int i=0; i<strValue.length()/2; i++) {
            if (strValue.charAt(left) != strValue.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromUpdated(String strValue) {
        int left = 0;
        int right = strValue.length()-1;

        while (left < right) {
            char lCh = strValue.charAt(left);
            char rCh = strValue.charAt(right);
            if (!Character.isDigit(lCh) && !Character.isLetter(lCh)) {
                ++left;
            } else if (!Character.isDigit(rCh) && !Character.isLetter(rCh)) {
                --right;
            } else if (Character.toLowerCase(lCh) != Character.toLowerCase(rCh)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static String findMaxPalindorm(String str) {
        String result = "";

        for (int i=0; i<str.length()-1; i++) {
            int length = Math.max(checkMaxPalindorm(str, i, i), checkMaxPalindorm(str, i, i+1));

            if (length > result.length()) {
                int start = i - (length-1)/2;
                int end = i + length/2+1;
                result = str.substring(start, end);
            }
        }
        return result;
    }

    private static int checkMaxPalindorm(String str, int left, int right) {
        while (left>=0 && right<=str.length()-1 && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}