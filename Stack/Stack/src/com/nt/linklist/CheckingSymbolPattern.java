package com.nt.linklist;

import java.util.Stack;

public class CheckingSymbolPattern {

	public static boolean isValidSymbolPattern(String input) {

		Stack<Character> stk = new Stack<Character>();
		
		if (input == null || input.length() == 0)
			return true;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ')') {

				if (!stk.isEmpty() && stk.peek() == '(')
					stk.pop();
				else
					return false;

			} else if (input.charAt(i) == '}') {
				if (!stk.isEmpty() && stk.peek() == '{')
					stk.pop();
				else
					return false;
			} else if (input.charAt(i) == ']') {
				if (!stk.isEmpty() && stk.peek() == '[')
					stk.pop();
				else
					return false;
			} else {
				stk.push(input.charAt(i));
				System.out.println(stk);
			}
		}// for
		System.out.println(stk);
		if (stk.isEmpty())
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		String input = "()(()[()]";
		// String input = "()";
		boolean isValid = isValidSymbolPattern(input);
		System.out.println(isValid);
	}

}
