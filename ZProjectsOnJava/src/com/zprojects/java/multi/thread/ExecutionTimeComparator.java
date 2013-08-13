package com.zprojects.java.multi.thread;

import java.util.Comparator;

public class ExecutionTimeComparator implements Comparator<MyThread>{

	@Override
	public int compare(MyThread o1, MyThread o2) {
		if(o1.getMyExecutionTime()<o2.getMyExecutionTime()){
			return -1;
		}else if(o1.getMyExecutionTime()>o2.getMyExecutionTime()){
			return 1;
		}
		return 0;
		 
	}

}
