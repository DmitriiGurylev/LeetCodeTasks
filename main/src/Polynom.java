package src;

public class Polynom {

    public static void main(String[] args) {
        String str1 = "qwertyuiopasddsaasddsapoiuytrewqhhh";
        String str2 = "qwertyuiopasddsasddsapoiuytrewqhhh";

        System.out.println(findMaxPolynom(str1));
        System.out.println(findMaxPolynom(str2));
    }

    public static String findMaxPolynom(String str) {
        String result = "";

        for (int i=0; i<str.length()-1; i++) {
            int length = Math.max(checkMaxPolynom(str, i, i), checkMaxPolynom(str, i, i+1));

            if (length > result.length()) {
                int start = i - (length-1)/2;
                int end = i + length/2+1;
                result = str.substring(start, end);
            }
        }
        return result;
    }

    private static int checkMaxPolynom(String str, int left, int right) {
        while (left>=0 && right<=str.length()-1 && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
