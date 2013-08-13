package z.core.java.poc.loops;

import java.util.Arrays;
import java.util.List;

public class VariousLoops {
	
	public static void main(String args[]){
		ForEachLoop forEachLoop = new ForEachLoop();
		String [] mylist = {"abc","bcd","delete","deletethis","notdeleted","thisis"};
		List<String> list = Arrays.asList(mylist);
		forEachLoop.testForEach(list);
	}

}

class ForEachLoop{
	
	public void testForEach(List<String> list){
		int i = 0;
		System.out.println("Received List.."+list);
		for(String str:list){
			System.out.println(i+"="+str);
			//str = str+"modified";
			if(str.equals("deletethis"))
				list.remove(i);
		i++;
		}
		System.out.println("Modified List.."+list);
	}
}