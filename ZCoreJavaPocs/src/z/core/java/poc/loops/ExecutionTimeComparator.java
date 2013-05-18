package z.core.java.poc.loops;

import java.util.Comparator;

public class ExecutionTimeComparator implements Comparator<MyJob> {

	@Override
	public int compare(MyJob o1, MyJob o2) {
		if(o1.getExecutionTime()<o2.getExecutionTime()){
			return -1;
		}if(o1.getExecutionTime()>o2.getExecutionTime()){
			return 1;
		}
	return 0;
	}

}
