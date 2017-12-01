package hacker.earth.problem;

import java.util.Scanner;

public class Sift {

	public static void main(String[] args) {
   		
		Scanner scan = new Scanner(System.in);
		int testcase = Integer.parseInt(scan.nextLine());
		for (int p=0; p<testcase; p++) {
		String []s = scan.nextLine().split(" ");
		String []arr = scan.nextLine().split(" ");
		//int len = arr.length;
		int len = Integer.parseInt(s[0]);
		int count = Integer.parseInt(s[1]);
		int []iar = new int[len];
		for (int i=0; i<len; i++)
			iar[i] = Integer.parseInt(arr[i]);
		
		for (int i=0; i<count; i++) {
			
			sifttoPos(iar,len);
		}System.out.println();	
		for (int i:iar)
			System.out.print(i+" ");
		}
		scan.close();
	}

	private static int[] sifttoPos(int[] arr, int len) {
	
		int tmp = arr[len-1];
		for (int i=len-2; i>=0; i--) {
			arr[i+1] = arr[i];
		}	
		arr[0] = tmp;		
		return arr;
	}
}
