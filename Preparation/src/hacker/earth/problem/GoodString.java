package hacker.earth.problem;

import java.util.Scanner;

public class GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		
		char[] ch = string.toCharArray();
		int count = 0,maxcount = 0;
		for (int i=0; i<ch.length; i++) {
			
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' )
				count ++;
			else {
				count = 0;
				maxcount = count;
			}
		}		
		System.out.println(maxcount);
	}
}
