package java8.example;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorting {

	public static void main(String[] args) {
		
		String[] array = new String[] {"abcONE","abcTWO","abcTHREE","abcFOUR","abcSIX","abcEIGHT","abcSEVEN","abcFIVE","abca","abcA"};
		
		//java 7
		/*Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.length() - o2.length();
			}
			
		});*/
		
		//java 8 lambda
		Arrays.sort(array, (o1,o2) -> o1.length() - o2.length());
		//Arrays.sort(array, (o1,o2) -> o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1)); //if we want to sort based on string last char value[ascii]
		
		
		for (String s : array)
			System.out.println(s);
	}
}
