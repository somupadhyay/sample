package z.core.java.poc.scheduling;

public class MyJob implements Runnable{

	private int executionTime;
	private static int runnumber;
	
	@Override
	public void run() {
		System.out.println("Hey Running at "+runnumber+ " Took "+executionTime+" Execution Time");
	}

	public static int getRunnumber() {
		return runnumber;
	}

	public static void setRunnumber(int runnumber) {
		MyJob.runnumber = runnumber;
	}

	public int getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}

	@Override
	public String toString() {
		return "MyJob [executionTime=" + executionTime + "]\n";
	}

	
}
