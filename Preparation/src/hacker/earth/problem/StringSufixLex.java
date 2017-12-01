package hacker.earth.problem;

import java.util.Arrays;
import java.util.Scanner;

public class StringSufixLex {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			String line = scan.nextLine();
			String[] array = line.split(" ");
			int count = Integer.parseInt(array[1]);
			int len = array[0].length();
			String[] arr = new String[len];
			for (int i=0; i<len; i++) {
				arr[i] = array[0].substring(i, len);
			}
			
			Arrays.sort(arr);
			
			System.out.println(arr[count-1]);
		}
	}
