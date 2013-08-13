package z.core.java.poc.loops;

import java.util.Comparator;

public class PriorityComparator implements Comparator<MyJob> {

	@Override
	public int compare(MyJob o1, MyJob o2) {
			if(o1.getPrority().ordinal()>o2.getPrority().ordinal()){
				return -1;
			}if(o1.getPrority().ordinal()<o2.getPrority().ordinal()){
				return 1;
			}
		return 0;
	}

}
