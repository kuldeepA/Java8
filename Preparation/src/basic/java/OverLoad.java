package basic.java;

class AB {
	/*static*/ void run() {
		System.out.println("AB class");
	}
}

class ABC extends AB {
	void run() {
		System.out.println("ABC class");
		String s1 = "hill5";
		 String s2 = "hill" + "5";
		 System.out.println(s1==s2);
		 String s3 = "hill5";
		 String s4 = "hill" + s1.length();
		 System.out.println(s3==s4);
		 
		 System.out.println("Apple".compareTo("Apple"));
	}
}

public class OverLoad {
	
	public static void main(String[] args) {

		AB obj = new ABC();
		obj.run();
		/*OverLoad obj = new OverLoad();
		obj.overLoad(null);*/
	}

	final private static void overLoad(Object o) {
		System.out.println("Object o argument method.");
	}

	private static void overLoad(double[] dArray) {
		System.out.println("double array argument method.");
	}
}
