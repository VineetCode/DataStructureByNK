package com.ds.stack.interview.program;

import java.util.Stack;

public class ReverseStringUsingStack {

	public Stack<Character> stack = null;

	public ReverseStringUsingStack() {
		stack = new Stack<Character>();
	}

	public String reverse(String name) {
		char[] ch = name.toCharArray();
		String reverse = "";
		for (char ch1 : ch) {
			stack.push(ch1);
		}
		while (!stack.isEmpty()) {
			reverse = reverse + stack.pop();
		}
		return reverse;
	}

	public static void main(String[] args) {

		String name = "vineet";
		ReverseStringUsingStack rev = new ReverseStringUsingStack();
		String reverse = rev.reverse(name);
		System.out.println(reverse);
	}

}
