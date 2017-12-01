package basic.java;

import java.util.ArrayList;
import java.util.List;

class Abt {

	public static <E> void append(List<E> list, Class<E> cls) throws Exception {
		E ele = cls.newInstance(); // OK
		// E ele= new E();
		list.add(ele);
	}
}

public class GenericsTest extends RuntimeException {

	public static void main(String ...strings) {
		
		int i;
		
		
		
		List<Integer> li = new ArrayList<>();
		//List<Number>  ln = (List<Number>) li; 
		
		List<String> l1 =  new ArrayList<>();
		ArrayList<String> l2 = (ArrayList<String>)l1; 
	}
}
