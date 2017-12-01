package basic.java;

import java.util.ArrayList;
import java.util.List;

public class GenericWildDemo {

	// wildcard arguments only
	public static void printList(ArrayList<?> list) {
		
		for (Object obj : list)
			System.out.println(obj);
	}
	
	// Wildcard Arguments With An Upper Bound
	public static void printNumber(ArrayList<? extends Number> list) {
		
		for (Object obj : list)
			System.out.println(obj);
	}
	
	// Wildcard Arguments With Lower Bound
	public static void printNumLower(ArrayList<? super Integer> list) {
		
		for (Object obj : list)
			System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> iList = new ArrayList<>();
		iList.add(23000);
		iList.add(34000);
		iList.add(62000);
		iList.add(93000);		
		
		ArrayList<String> sList =  new ArrayList<>();
		sList.add("s1");
		sList.add("s2");
		sList.add("s3");
		sList.add("s4");
		
		ArrayList<Double> dList =  new ArrayList<>();
		dList.add(45.56);
		dList.add(49.56);
		dList.add(78.56);
		dList.add(98.56);
		
		ArrayList<Number> nList =  new ArrayList<>();
		nList.add(11.77);
		nList.add(3000);
		nList.add(22.99);
		nList.add(2563);
		
		System.out.println("Printing ? only");
		//start: wildcard arguments only
		printList(iList);
		printList(sList);
		printList(dList);
		//end: wildcard arguments only
		
		System.out.println("Printing ? extends only");
		//start: Wildcard Arguments With An Upper Bound
		printNumber(iList);
		printNumber(dList);
		//printNumber(sList); 										//will give compile time error
		//end: Wildcard Arguments With An Upper Bound
		
		System.out.println("Printing ? super only");
		//start: Wildcard Arguments With Lower Bound
		printNumLower(iList);
		printNumLower(nList);
		//printNumLower(dList);   									//will give compile time error
		//end: Wildcard Arguments With Lower Bound
	}
}
