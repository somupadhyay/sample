package com.zprojects.java.multi.thread;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyThreadProcessor {

	public static void main(String[] args) {
		Comparator<MyThread> timeComparator = new ExecutionTimeComparator();
		PriorityQueue<MyThread> threads = new PriorityQueue<MyThread>(10,timeComparator);
		MyThread thread1 = new MyThread();
		thread1.setMyExecutionTime(3);
		thread1.setMyName("Thread1");
		threads.add(thread1);
		
		thread1 = new MyThread();
		thread1.setMyExecutionTime(1);
		thread1.setMyName("Thread2");
		threads.add(thread1);
		
		thread1 = new MyThread();
		thread1.setMyExecutionTime(2);
		thread1.setMyName("Thread3");
		threads.add(thread1);
		
		while (threads.size()!=0) {
			MyThread myThread = threads.remove();
			Thread thread = new Thread(myThread);
			thread.start();
		}
	}
	
}
