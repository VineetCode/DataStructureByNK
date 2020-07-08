package com.nt.multithreading;

import java.util.Arrays;
import java.util.List;

public class PrintSumInTwoThread {
	
	public static void main(String[] args) {
		List<Integer> sharedlList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Thread t1=new Thread(new Sum1To5Number(sharedlList),"First Thread ::");
		Thread t2=new Thread(new Sum6To10Number(sharedlList),"Second Thread ::");
		
		t1.start();
		t2.start();
	}

}
