package codility.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BinaryGap {

	public static int solution(int N) {

		return getMaxGap(getBinary(N));

	}

	private static int getMaxGap(List<Integer> list) {

		//ListIterator<Integer> it =  list.listIterator();
		Set<Integer> set = new HashSet<>();
		int count = 0, index = 0;

		if (!list.contains(0)) {
			return 0;
		} else {
			//while (it.hasNext()) {
			int size = list.size();
			for (int i=0; i<size; i++) {
			//	int i = it.next();
			//	if (it.next() == 0)
				if (list.get(i) == 0)
					count++;
				else {
					for (int j=index; j<size; j++) {
						if (list.get(j) == 1) {
							index++;
						}
					}
					if (index > 0) {
					set.add(count);
					count = 0;}
				} index++; 
			}
			count = Collections.max(set);
		}
		return count;
	}

	private static List<Integer> getBinary(int n) {

		List<Integer> list = new LinkedList<>();
		while (n > 0) {
			
			list.add(n % 2);
			n = n / 2;
		}
		Collections.reverse(list);
		return list;
	}

	public static void main(String[] args) {

		int max = solution(20);
		System.out.println(max);
	}

}
