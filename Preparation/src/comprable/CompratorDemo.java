package comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CountComp implements Comparator<University> {

	@Override
	public int compare(University o1, University o2) {
		// TODO Auto-generated method stub
		if (o1.getCount() > o2.getCount())
			return -1;
		else if (o1.getCount() < o2.getCount())
			return 1;
		else
			return 0;
	}
}

class CountYear implements Comparator<University> {

	@Override
	public int compare(University o1, University o2) {
		// TODO Auto-generated method stub
		return o1.getYear() .compareTo( o2.getYear());
		
	}
	
}


public class CompratorDemo {

	public static void main(String[] args) {
		
		ArrayList<University> list = new ArrayList<>();
		University s = new University("Sing", 1702, "1970", "A");
		University m = new University("MIT", 1502, "1986", "B");
		University d = new University("DY Patil", 6502, "1988", "C");
		list.add(d);
		list.add(m);
		list.add(s);
		
		System.out.println("Sorted Result based on Count of Student");
		Collections.sort(list, new CountComp());
		
		for (University u : list)
			System.out.println(u.getCollegeName() + " - "+u.getYear() +" - "+u.getCount() +" - "+u.getCat());
		
		System.out.println("\n\nSorted Result based on Year");
		Collections.sort(list, new CountYear());
		
		for (University u : list)
			System.out.println(u.getCollegeName() + " - "+u.getYear() +" - "+u.getCount() +" - "+u.getCat());
	}

}
