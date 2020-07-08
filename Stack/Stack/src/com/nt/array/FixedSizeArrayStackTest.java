package com.nt.array;

public class FixedSizeArrayStackTest {
	public static void main(String[] args) throws Exception {
		int i=0;

		FixedSizeArrayStack stack = new FixedSizeArrayStack(15);

		System.out.println("Is STACK Empty ::" + stack.isEmpty());

		System.out.println("STACK Size ::" + stack.size());

		for (i = 10; i <= 100; i = i + 10) {
			stack.push(i);
		}
		System.out.println(stack);

		System.out.println("Is STACK Empty ::" + stack.isEmpty());

		System.out.println("STACK Size ::" + stack.size());

		System.out.println("Peek Element ::" + stack.peek());

		System.out.println("Pop Element ::" + stack.pop());

		System.out.println(stack);
	}

}
