package z.core.java.poc.scheduling;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyScheduler {

	public static void main(String[] args) {
		Comparator<MyJob> comparator = new ExeTimeComparator();
		PriorityQueue<MyJob> jobQueue = new PriorityQueue<MyJob>(10, comparator);

		MyJob job1 = new MyJob();
		job1.setExecutionTime(1);
		jobQueue.offer(job1);
		
		job1 = new MyJob();
		job1.setExecutionTime(1);
		jobQueue.offer(job1);
		
		job1 = new MyJob();
		job1.setExecutionTime(0);
		jobQueue.offer(job1);
		
		job1 = new MyJob();
		job1.setExecutionTime(0);
		jobQueue.offer(job1);
		
		job1 = new MyJob();
		job1.setExecutionTime(3);
		jobQueue.offer(job1);
		
		System.out.println(jobQueue);
		System.err.println("+++++++++++++++++++++++++++++");
		
		while (jobQueue.size() != 0) {
			MyJob job = jobQueue.remove();
			job.setRunnumber(MyJob.getRunnumber() + 1);
			Thread t1 = new Thread(job);
			t1.run();
		}

	}
}
