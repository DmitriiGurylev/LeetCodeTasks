package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;



// s  : (}
// st : (

public class ValidParentheses {

    public boolean isValidParenthesesVersion1(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else {
                if (st.empty()) {
                    return false;
                }
                if ((ch == ']' && st.peek() == '[') || (ch == '}' && st.peek() == '{') || (ch == ')' && st.peek() == '(')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public boolean isValidParenthesesVersion2(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> chMap = new HashMap<>();
        chMap.put(')', '(');
        chMap.put(']', '[');
        chMap.put('}', '{');
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else if (st.empty() || st.pop() != chMap.get(ch)) {
                return false;
            }
        }
        return st.empty();
    }

    // good
    public boolean isValidParenthesesVersion3(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') {
                st.push(']');
            } else if (ch == '(') {
                st.push(')');
            } else if (ch == '{') {
                st.push('}');
            } else if (st.empty() || ch != st.pop()) {
                return false;
            }
        }
        return st.empty();
    }

    public boolean isValidParenthesesVersion4(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> chMap = new HashMap<>();
        chMap.put('(', ')');
        chMap.put('[', ']');
        chMap.put('{', '}');

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (chMap.containsKey(ch)) {
                st.push(chMap.get(ch));
            } else if (st.empty() || ch != st.pop()) {
                return false;
            }
        }
        return st.empty();
    }
}
