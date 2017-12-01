package hacker.earth.problem;

import java.util.Scanner;

public class StringIn {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		String[] s = new String[no];
		int[] array = new int[no];

		for (int i = 0; i < no; i++) {
			s[i] = scan.next();
		}
		int count = 0;
		for (int c = no - 1; c >= 0; c--) {
			for (int j = c; j >= 1; j--) {
				System.out.println(s[c] + "--" + s[j - 1]);
				if (s[c].compareTo(s[j - 1]) > 0) {
					
					count++;
				}
			}
			array[c] = count;
			count = 0;
		}

		for (int i : array)
			System.out.println(i);
	}

}