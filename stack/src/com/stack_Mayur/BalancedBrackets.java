package com.stack_Mayur;

import java.util.Stack;

public class BalancedBrackets {

    	    public static boolean isValid(String s) {
    	        Stack<Character> stack = new Stack<Character>();
    	        
    	        for (char c : s.toCharArray()) {
    	            if (c == '(' || c == '[' || c == '{') {
    	                stack.push(c);
    	            } else { 
    	                if (stack.isEmpty()) {
    	                    return false;
    	                }
    	                char top = stack.peek();
    	                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
    	                    stack.pop();
    	                } else { 
    	                    return false;
    	                }
    	            }
    	        }
    	        // If the stack is empty, all opening brackets have been closed, so return true
    	        // Otherwise, there are unmatched opening brackets, so return false
    	        return stack.isEmpty();
    	    }


    public static void main(String[] args) {
        String s1 = "((()))"; // Balanced
        String s2 = "((){}[])"; // Balanced
        String s3 = "(()))"; // Unbalanced
        String s4 = "({[]}"; // Unbalanced

        System.out.println(s1 + " is balanced: " + isValid(s1));
        System.out.println(s2 + " is balanced: " + isValid(s2));
        System.out.println(s3 + " is balanced: " + isValid(s3));
        System.out.println(s4 + " is balanced: " + isValid(s4));
    }
}
