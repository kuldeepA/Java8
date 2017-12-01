package hacker.earth.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Palindrome {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nTest = Integer.parseInt(br.readLine());
		String []array = new String[nTest];
		//HashMap<String,String> map = new HashMap<>();
	
		for (int i=0; i<nTest; i++) {
			array[i] = br.readLine();
		}
		String flag = null;
		
		for (int i=0; i<nTest; i++) {
			if (array[i].length()%2 == 0)
				flag = "even";
			else
				flag = "odd";
			StringBuilder b = new StringBuilder();
			
			if (array[i].equals(b.append(array[i]).reverse().toString())) {
				
				System.out.println("Yes "+flag);
			}
		}
		
	}
}
