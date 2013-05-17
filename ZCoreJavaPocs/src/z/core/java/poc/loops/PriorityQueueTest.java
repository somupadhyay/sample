package z.core.java.poc.loops;

import java.util.Comparator;
import java.util.PriorityQueue;

import z.core.java.poc.loops.MyJob.PRIORITIES;

public class PriorityQueueTest {

	public static void main(String[] args) {
		Comparator<MyJob> priorityComparator = new PriorityComparator();
		PriorityQueue<MyJob> pQueue = new PriorityQueue<MyJob>(10, priorityComparator);
		MyJob myjob = new MyJob();

		myjob.setExecutionTime(2);
		myjob.setJobintime(System.currentTimeMillis());
		myjob.setJobid(1);
		myjob.setPrority(PRIORITIES.HIGH);
		pQueue.add(myjob);

		myjob = new MyJob();
		myjob.setExecutionTime(2);
		myjob.setJobintime(System.currentTimeMillis());
		myjob.setJobid(2);
		myjob.setPrority(PRIORITIES.NORMAL);
		pQueue.add(myjob);

		myjob = new MyJob();
		myjob.setExecutionTime(1);
		myjob.setJobintime(System.currentTimeMillis());
		myjob.setJobid(3);
		myjob.setPrority(PRIORITIES.HIGH);
		pQueue.add(myjob);
		System.out.println(pQueue);
		while(pQueue.size()!=0){
			System.out.println(pQueue.remove());
		}
	}
}
