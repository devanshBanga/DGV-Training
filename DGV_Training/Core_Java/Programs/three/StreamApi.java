package three;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	public void streamApi() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(20);
		a.add(35);
		a.add(50);
		a.add(90);
	    List<Integer> n = a.stream().map((r)->{
	    	return r*2;
	    }).collect(Collectors.toList());
	    
	    List<Integer> fil = n.stream().filter((r)->{
	    	return r>70;
	    }).collect(Collectors.toList());
	    
	    fil.forEach((r)->{
	    	System.out.println(r);
	    });
	}
}
