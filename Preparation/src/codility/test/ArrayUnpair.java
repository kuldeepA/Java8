package codility.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class ArrayUnpair {

	public int solution(int[] A) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int number=0;
		for (int i=0; i<A.length; i++) {
			
			if (map.containsKey(A[i])) {
				int count = map.get(A[i]);
				map.put(A[i], ++count);
			} else
				map.put(A[i], 1);
		}
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                number = entry.getKey();
            }
        }
		return number;
	}

	public static void main(String[] args) {

		int A[] = new int[9];
		A[0] = 1;
		A[1] = 2;
		A[2] = 1;
		A[3] = 7;
		A[4] = 7;
		A[5] = 4;
		A[6] = 4;
		A[7] = 2;
		A[8] = 9;

		int num = new ArrayUnpair().solution(A);
		System.out.println(num);
	}
}
