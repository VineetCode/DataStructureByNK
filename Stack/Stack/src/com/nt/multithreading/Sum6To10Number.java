package com.nt.multithreading;

import java.util.List;

public class Sum6To10Number implements Runnable {
	
	public List<Integer> sharedList;
	int count=0;
	int sum=0;
	
	public Sum6To10Number(List<Integer> sharedList) {
	 this.sharedList=sharedList;
	}

	@Override
	public void run() {
		synchronized (sharedList) {
			for(Integer itr : sharedList){
				sum= sum + itr;
				System.out.println("Sum 6 To 10 :"+sum);
				count++;
				if(count<=5){
					try {
						sharedList.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}//if
			}
		
			sharedList.notify();
		}// synchronized block
		
	}//run method()

}
