package com.stack_Mayur;

public class LLImplimentaion {
	public static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static class LLStack {
		Node head = null;
		int size = 0;

		void push(int val) {
			Node temp = new Node(val);
			temp.next = head;
			head = temp;
			size++;
		}

		int pop() {
			if (head == null) {
				System.out.println("Stack is Empty, CanNot Pop ");
				return -1;
			}
			int val = head.data;
			head = head.next;
			return val;
		}

		int peek() {
			if (head == null) {
				System.out.println("Stack is Empty, CanNot Pop ");
				return -1;
			}
			return head.data;
		}
		// Reverse Display
		void displayReverse() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		// Displaying Using Recusrsion
		void display() {
			displayrec(head);
			System.out.println();
		}
		void displayrec(Node h) {
			if(h == null) return;
			displayrec(h.next);
			System.out.println(h.data + " ");
		}
		int size() {
			return size;
		}
	}

	public static void main(String[] args) {
		LLStack st = new LLStack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.displayReverse();
		st.display();

		System.out.println("Stack size: " + st.size());
		System.out.println("Top element: " + st.peek());

		st.pop();

		System.out.println("Stack size after popping: " + st.size());
		System.out.println("Top element after popping: " + st.peek());
	}
}
