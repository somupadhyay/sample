package z.core.java.poc.scheduling;

import java.util.Comparator;

public class ExeTimeComparator implements Comparator<MyJob>{

	@Override
	public int compare(MyJob o1, MyJob o2) {
		return o1.getExecutionTime()-o2.getExecutionTime();
	}

}
