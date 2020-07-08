package com.queue.fixedsizearray;

public class FixedSizeArrayQueueTest {

	public static void main(String[] args) throws Exception{
		
		FixedSizeArrayQueue queue=new FixedSizeArrayQueue();
		
		System.out.println("IsEmpty :: "+queue.isEmpty());
		System.out.println("IsFull  :: "+queue.isFull());
		System.out.println("Size    :: "+queue.size());
		System.out.println(queue);

		for(int i=0;i<10;i++){
			queue.enQueue(i);
		}
		System.out.println("=======================================");
		System.out.println("IsEmpty :: "+queue.isEmpty());
		System.out.println("IsFull  :: "+queue.isFull());
		System.out.println("Size    :: "+queue.size());
		System.out.println(queue);
		System.out.println("========================================");
		
		System.out.println("Remove Element is :: "+queue.deQueue());
		System.out.println("IsEmpty :: "+queue.isEmpty());
		System.out.println("IsFull  :: "+queue.isFull());
		System.out.println("Size    :: "+queue.size());
		System.out.println(queue);
		System.out.println("========================================");
		
		
		
	}

}
