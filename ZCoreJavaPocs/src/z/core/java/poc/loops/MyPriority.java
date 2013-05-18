package z.core.java.poc.loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import z.core.java.poc.loops.MyJob.PRIORITIES;

public class MyPriority {

	public static void main(String args[]){
		List<MyJob> myjobs = new ArrayList<MyJob>();
		MyJob myjob = new MyJob();
		
		myjob.setExecutionTime(2);
		myjob.setJobintime(System.currentTimeMillis());
		myjob.setJobid(1);
		myjob.setPrority(PRIORITIES.HIGH);
		myjobs.add(myjob);
		
		myjob = new MyJob();
		myjob.setExecutionTime(2);
		myjob.setJobintime(System.currentTimeMillis());
		myjob.setJobid(2);
		myjob.setPrority(PRIORITIES.NORMAL);
		myjobs.add(myjob);
		
		myjob = new MyJob();
		myjob.setExecutionTime(1);
		myjob.setJobintime(System.currentTimeMillis());
		myjob.setJobid(3);
		myjob.setPrority(PRIORITIES.HIGH);
		myjobs.add(myjob);
	
		System.out.println("before sorting"+myjobs);
		Collections.sort(myjobs);
		System.out.println("after sorting"+myjobs);
		
		System.out.println("Sorting according to priority only...");
		Comparator<MyJob> priorityComparator = new PriorityComparator();
		Collections.sort(myjobs, priorityComparator);
		System.out.println("after sorting"+myjobs);
		
		Comparator<MyJob> exeTimeComparator = new ExecutionTimeComparator();
		Collections.sort(myjobs, exeTimeComparator);
		System.out.println(myjobs);
	}
	
	
}
