package comprable;

import java.util.ArrayList;
import java.util.Collections;

class University implements Comparable<University> {

	private String collegeName;
	private int count;
	private String year;
	private String cat;
	
	public University(String collegeName, int count, String year, String cat) {
		
		this.collegeName = collegeName;
		this.count = count;
		this.year = year;
		this.cat = cat;
	}
	
	/*@Override
	public int compareTo(University o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	public int compareTo(University o) {
	
		return this.count - o.count;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public int getCount() {
		return count;
	}

	public String getYear() {
		return year;
	}

	public String getCat() {
		return cat;
	}	
}

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<University> list = new ArrayList<>();
		University s = new University("Sing", 1702, "1970", "A");
		University m = new University("MIT", 1502, "1986", "B");
		University d = new University("DY Patil", 6502, "1988", "C");
		list.add(d);
		list.add(m);
		list.add(s);
		
		Collections.sort(list);
		
		for (University u : list)
			System.out.println(u.getCollegeName() + " - "+u.getYear() +" - "+u.getCount() +" - "+u.getCat());
	}
}
