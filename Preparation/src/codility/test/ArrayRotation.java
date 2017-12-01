package codility.test;

public class ArrayRotation {

	public int[] solution(int[] A, int K) {
		
		int B[] = new int[A.length];
		for (int i=0; i<=K-1; i++) {
			System.out.println("Count--"+i);
			B = rotate(A);
		}
		for(int i:B)
			System.out.print(i);
		return B;	
	}
	
	private int[] rotate(int[] a) {
		int i;
		int tmp = a[0];
		for (i=0; i<a.length-1; i++) {
			a[i] = a[i + 1];
			a[i] = tmp;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[5];
		A[0] = 3;
		A[1] = 8;
		A[2] = 9;
		A[3] = 7;
		A[4] = 6;
		/*A[5] = 6;
		A[6] = 7;
		A[7] = 8;
		A[8] = 9;*/
		new ArrayRotation().solution(A, 3);
	}
}
