package src;

/* Given a string s, find the length of the longest substring without repeating characters.
 *
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3595/
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int countNow=0;
        int c=0;
        int indexNow=0;
        for (int i=0; i<s.length(); i++){
            if (!set.contains(s.charAt(i))){

                set.add(s.charAt(i));
                countNow++;
            }
            else{
                if (countNow>c)
                    c = countNow;
                
                countNow=0;
                set.clear();
                indexNow++;
                i=indexNow-1;
            }
            if ((i==s.length()-1) && (countNow>c))
                c = countNow;
        }

        return c;
    }
}
