package com.nt.multithreading;

import java.util.List;

public class Sum1To5Number implements Runnable {

	public List<Integer> sharedList;
	int sum = 0;
	int count = 0;

	public Sum1To5Number(List<Integer> shaIntegers) {
		this.sharedList = shaIntegers;
	}

	@Override
	public void run() {

		synchronized (sharedList) {
			for(Integer itr : sharedList){
				sum= sum + itr;
				System.out.println("Sum 1 To 5 :"+sum);
				count++;
				if(count==5){
					try {
						sharedList.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}//if
			}//for		
			sharedList.notify();
		}// synchronized block

	}// run method

}// class
