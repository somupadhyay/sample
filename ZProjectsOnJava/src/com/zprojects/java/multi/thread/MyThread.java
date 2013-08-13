package com.zprojects.java.multi.thread;

public class MyThread implements Runnable{

	private int myExecutionTime;
	private String myName;
	
	@Override
	public void run() {
		System.out.println("Thread :" +myName+" \tExecution Time :" +myExecutionTime);
		/*System.out.println("Execution Time :" +myExecutionTime);
		System.out.println("Priority :" );
*/		
	}

	public int getMyExecutionTime() {
		return myExecutionTime;
	}

	public void setMyExecutionTime(int myExecutionTime) {
		this.myExecutionTime = myExecutionTime;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	
}
