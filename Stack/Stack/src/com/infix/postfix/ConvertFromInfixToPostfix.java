package com.infix.postfix;

import java.util.Stack;

public class ConvertFromInfixToPostfix {

	public static int prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}// switch
		return -1;
	}// end of prec

	public static String infixToPostfix(String exp) {

		String result = new String();

		Stack<Character> stk = new Stack<Character>();

		for (int i = 0; i < exp.length(); i++) {

			char c = exp.charAt(i);

			if (Character.isLetterOrDigit(c)) {
				result += c;
			} 
			
			else if (c == '(') {
				stk.push(c);
			}
			
			else if (c == ')') {
				while (!stk.isEmpty() && stk.peek() != '(') {
					result += stk.pop();
				}
				if (!stk.isEmpty() && stk.peek() != '(')
					return "Invalid Expression";
				else
					stk.pop();
			}
			
			else {
				while (!stk.isEmpty() && prec(c) <= prec(stk.peek())) {
					result += stk.pop();
				}
				stk.push(c);
			}

		}// end of for-loop

		while (!stk.isEmpty())
			result += stk.pop();

		return result;

	}// end of method

	public static void main(String[] args) {
		//String exp = "a+b*(c^d-e)^(f+g*h)-i";
		//String exp="A*B-(C+D)+E";
		String exp="(A-B/C)*(A/K-L)";
		System.out.println(infixToPostfix(exp));
	}
}
 