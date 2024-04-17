package com.stack_Mayur;

import java.util.*;

class Stack {
    private List<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        int top = stack.get(lastIndex);
        stack.remove(lastIndex);
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}

public class StackImplemention {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Size of stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

