package basic.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class FailFast {
	
	 void runFast() {
		 
		/*List<String> list =  new ArrayList<String>() {{ 
			add("A1");
			add("A2");
			add("A3");
			add("A4");
		}};*/
		 
		List<String> list =  new ArrayList<String>();
		list.add("A1");
		list.add("A2");
		/*list.add("A3");
		list.add("A4");*/
		 
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			itr.next();
			//list.add("A5");
			//itr.remove();   // this will not through any exception
		}
		
		Set s = new HashSet();
		s.add("1");
		s.add("2");
		s.add("3");
		
		Iterator it = s.iterator();
		System.out.println(it.next());
	}
}

class FailSafe {
	
	void runSafe() {

		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = (String) it.next();

			System.out.println(key + " : " + map.get(key));

			map.put("FIVE", 5); 
		}
		System.out.println("---"+map.get("FIVE"));
	}
}

public class FailFastSAFE {

	public static void main(String...args) {
		
		FailFast fast = new FailFast();
		fast.runFast();
		//new FailSafe().runSafe();
	}
}
