package com.infix.prefix;

import java.util.Stack;

public class ConvertInfixToPrefix {


	public static int precedence(char ch) {

		switch (ch) {
		case '^':
			return 3;
		case '/':
		case '*':
			return 2;
		case '+':
		case '-':
			return 1;
		}
		return -1;

	}

	public static boolean isOperator(char ch) {
		switch (ch) {
		case '/':
		case '*':
		case '+':
		case '-':
			return true;
		}
		return false;

	}

	public static String infixToPostfix(String exp) {

		Stack<Character> stk = new Stack<Character>();

		String result = new String();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (Character.isLetterOrDigit(ch)) 
				result += ch;
			
			 else if (ch == '(') 
				stk.push(ch);
			
			 else if (ch == ')') {

				while (!stk.isEmpty() && stk.peek() != '(') 
					result += stk.pop();
				
				if (!stk.isEmpty() && stk.peek() != '(')
					return "Invalid Expression";
				else
					stk.pop();
			} else {
				while (!stk.isEmpty()
						&& precedence(ch) <= precedence(stk.peek()))
					result += stk.pop();
				stk.push(ch);
			}
		}// end of for-loop

		while (!stk.isEmpty())
			result += stk.pop();
		return result;
	}

	public static String postfixToPrefix(String exp) {
		Stack<String> skt1 = new Stack<String>();
		char expA[] = exp.toCharArray();

		String result = "";
		for (int i = 0; i < expA.length; i++) {
			if (isOperator(expA[i])) {
				String op1 = skt1.pop();
				String op2 = skt1.pop();

				String temp = expA[i] + op2 + op1;
				skt1.push(temp);
			} else {
				skt1.push(expA[i] + "");
			}
		}
		return skt1.peek();
	}

	public static void main(String[] args) {
		String exp1 = "(A-B/C)*(A/K-L)";
		System.out.println("Infix :" + exp1);

		String exp2 = infixToPostfix(exp1);
		
		String exp3 = postfixToPrefix(exp2);
		System.out.println("Prefix ::" + exp3);// *-A/BC-/AKL

	}

}
