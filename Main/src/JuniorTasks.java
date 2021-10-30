package src;

import java.util.Arrays;

public class JuniorTasks {
    public static void main(String[] args) {
        int value1 = 1589524;
        int value2 = 8962698;
        String value1Str = "94752001";
        String value2Str = "189056784959959487650981";

        System.out.println(isPalindrom(value1));
        System.out.println(isPalindrom(value2));
        System.out.println(isPalindrom(value1Str));
        System.out.println(isPalindrom(value2Str));
    }

   public static boolean isPalindrom(int intValue) {
        char[] value = String.valueOf(intValue).toCharArray();
        for (int i=0; i<value.length/2; i++) {
            if (value[i] != value[value.length - 1 - i]) {
                return false;
            }
        }
       return true;
   }

    public static boolean isPalindrom(String strValue) {
        char[] value = strValue.toCharArray();
        for (int i=0; i<value.length/2; i++) {
            if (value[i] != value[value.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}