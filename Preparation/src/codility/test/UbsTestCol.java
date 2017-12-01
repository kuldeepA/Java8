package codility.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Fruit{ }

class Apple extends Fruit { } 

public class UbsTestCol {

	List<Fruit> list;
	
	public UbsTestCol() {
		list = new ArrayList();
	}
	
	public UbsTestCol(List<Fruit> plist) {
		list = plist;
	}
	
	void addFruit(Collection<? extends Fruit> col) {
		
		Fruit f1 = new Fruit();
		Fruit f = new Apple();
		Apple a = new Apple();
		//col.add(f);
		col.add(null);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
