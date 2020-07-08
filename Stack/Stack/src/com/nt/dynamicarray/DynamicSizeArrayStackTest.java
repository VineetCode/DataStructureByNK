package com.nt.dynamicarray;

public class
DynamicSizeArrayStackTest {
	public static void main(String[] args) throws Exception {

		DynamicSizeArrayStack stack=new DynamicSizeArrayStack(10);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.MINCAPACITY);
		
		for(int i=10;i<=100;i+=10){
			stack.push(i);
		}
	    
		System.out.println(stack);
		System.out.println(stack.top());
		
		
		
		
	}
}
  