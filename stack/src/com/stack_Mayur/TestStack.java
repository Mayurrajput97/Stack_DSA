package com.stack_Mayur;

public class TestStack {
	public static  class Stack {
	   private int [] arr = new int[5];
	   private int idx = 0;
	    
	     void push(int val) {
	        if (isFull()) {
	            System.out.println("Stack is full");
	            return;
	        }
	        arr[idx] = val;  
	        idx++;
	    }

	    public int pop() {
	        if (idx == 0) {
	            System.out.println("Stack is empty ");
	            return -1;  
	        }
	        int top = arr[idx-1]; 
	        arr[idx - 1] = 0;
	        idx--;
	        return top;
	    }

	    public int peek() {
	        if (idx== 0) {
	            System.out.println("Stack is empty.");
	            return -1;  
	        }
	        return arr[idx-1];
	    }
	    void display() {
	    	for(int i = 0; i<= idx-1; i++ ) {
	    		System.out.println(arr[i] + " "); 
	    	}
	    	System.out.println();
	    }	    
	    public int size() {
	        return idx;
	    }
	     boolean isEmpty() {
	    	 if(idx == 0) return true;
	    	 else return false;
	    }
	     boolean isFull() {
	    	 if(idx == arr.length) return true;
	    	 else return false;
	    }
	}
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.display();

        System.out.println("Stack size: " + st.size());
        System.out.println("Top element: " + st.peek());

        st.pop();
        st.display();


        System.out.println("Stack size after popping: " + st.size());
        System.out.println("Top element after popping: " + st.peek());
        st.isEmpty();
        st.isFull();
    }
}

