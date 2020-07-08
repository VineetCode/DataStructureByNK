package com.nt.test;

import java.util.Scanner;

public class IntegerReplaceWithString {
	public static void main(String[] args) {
		
		String[] str=new String[100];
		Scanner sc=new Scanner(System.in);
		
		for(int i=1; i<100;i++){
			if(i==5){
				str[i]="Java";
			}
			else if(i==8){
				str[i]="mava";
			}else{
			
			str[i]=String.valueOf(i);
			}
		}
		
		for(int i=1;i<str.length;i++){
			System.out.println(str[i]);
		}
	}

}
