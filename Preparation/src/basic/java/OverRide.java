package basic.java;

import java.util.HashSet;

class X {
	 void run(Integer i) {//static
		System.out.println("Parent ");
	}
}

class Y extends X{
	 void run(int i) {//static
		System.out.println("Child");
	}
}

public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X obj =  new Y();
		obj.run(new Integer(6));
	}

}
