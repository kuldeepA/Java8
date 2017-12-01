package hacker.earth.problem;

import java.util.Scanner;

public class ModuloSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan = new Scanner(System.in);
		String []marry = scan.nextLine().trim().split(" ");
		String []array = scan.nextLine().trim().split(" ");
		int []mia = new int[marry.length];
		int []iar = new int[array.length];
		int []nar = new int[array.length];
		mia = getIntValue(marry, mia);
		iar = getIntValue(array, iar);
		int tmp;
		for (int i=0; i<mia[0]; i++) {
			for (int j=0; j<mia[0]-i-1; j++) {
				
				
				
				if (iar[j] % mia[1] > iar[j+1] % mia[1]) {
					tmp = iar[j];
					iar[j] = iar[j+1];
					iar[j+1] = tmp;
				}
			}
		}
		for (int i:iar)
			System.out.print(i+" ");
	}

	private static int[] getIntValue(String[] arry, int[] arri) {
		
		for (int i=0; i<arry.length; i++) 
			arri[i] = Integer.parseInt(arry[i]);
		return arri;
	}
}


