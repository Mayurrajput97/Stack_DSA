package com.stack_Mayur;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced: no matching opening bracket
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false; // Unbalanced: mismatched brackets
                }
            }
        }

        return stack.isEmpty(); // Balanced if stack is empty at the end
    }

    public static void main(String[] args) {
        String s1 = "((()))"; // Balanced
        String s2 = "((){}[])"; // Balanced
        String s3 = "(()))"; // Unbalanced
        String s4 = "({[]}"; // Unbalanced

        System.out.println(s1 + " is balanced: " + isBalanced(s1));
        System.out.println(s2 + " is balanced: " + isBalanced(s2));
        System.out.println(s3 + " is balanced: " + isBalanced(s3));
        System.out.println(s4 + " is balanced: " + isBalanced(s4));
    }
}
