package com.nt.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static int IsNumberPairOrNot(int[] arr) {

		boolean flag = false;
		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = i + 1; j < arr.length; i++) {
				if (arr[i] == arr[j]) {
				   
					
				} else {
					t=arr[i];
					System.out.println(t);
					break;
				}
			}//inner-for
			
		}//outer-for
		if (flag)
			return -1;
		else
			return t;

	}

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int size = sc.nextInt(); int[]
		 * arr = new int[size];
		 * 
		 * for (int i = 0; i < size; i++) { arr[i] = sc.nextInt(); }
		 */
		int[] arr = { 1, 2, 2, 3, 3 };
		Arrays.sort(arr);
		int result = IsNumberPairOrNot(arr);
		System.out.println(result);

	}
}
