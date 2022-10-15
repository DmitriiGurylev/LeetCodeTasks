package src;

import java.util.*;

public class KUniqueCharacters {

    public static void main(String[] args) {
        String[] str = new String[3];
        Random r = new Random();

        for (int j=0; j<3; j++) {
            StringBuilder sb = new StringBuilder();
            sb.append((int)(Math.random() * 5)+2);
            for (int i=0; i<(int)(Math.random() * 30)+10; i++) {
                sb.append((char)(r.nextInt('z' - 'a') + 'a'));
            }
            str[j] = String.valueOf(sb);
            System.out.println(str[j]);
            System.out.println(kUniqueCharacters(str[j]));
            System.out.println("\n\n\n");
        }
    }


    private static String kUniqueCharacters(String str) {
        if (str.length()<=1) {
            return "";
        }
        List<String> listOfStrings = new ArrayList<>();

        int numberOfUniqueCharacters = Integer.parseInt(String.valueOf(str.charAt(0)));
        int leftCharIndex = 1;
        int maxLength = 0;

        Map<Character, Integer> mapOfFirstChars = new HashMap<>(); // map to find first appearance of a symbol

        // itrating throug the input string
        for (int i=1; i<str.length(); i++) {
            char nowChar = str.charAt(i); // current symbol

            if (!mapOfFirstChars.containsKey(nowChar)) {
                mapOfFirstChars.put(nowChar, i);
            }

            if (mapOfFirstChars.size()<=numberOfUniqueCharacters) {
                maxLength++;
            } else {
                listOfStrings.add(str.substring(leftCharIndex, maxLength+leftCharIndex));

                // find next left char
                char leftChar = str.charAt(leftCharIndex);
                mapOfFirstChars.remove(leftChar);

                for (int j=leftCharIndex+1; j<str.length(); j++) {
                    if (str.charAt(j) != leftChar) {
                        leftCharIndex = j;
                        break;
                    }
                    maxLength--;
                }
            }
        }

        for (String listOfString : listOfStrings) {
            if (listOfString.length() == maxLength) {
                return listOfString;
            }
        }
        return "";
    }
}
