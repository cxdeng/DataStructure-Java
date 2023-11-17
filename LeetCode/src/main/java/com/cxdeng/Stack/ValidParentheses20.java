package com.cxdeng.Stack;

import java.util.LinkedList;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else {
                if (!stack.isEmpty() && ch == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
