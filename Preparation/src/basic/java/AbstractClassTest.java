package basic.java;

/*
 * Abstarct class can implement interface only.
 * Abstract class can have constructor.
 */
abstract class AbstractDemmo implements Species{
	
	public AbstractDemmo(/*String s*/){   //if we added argument here then we need to call this const by using super keyword in child class
		
		System.out.println("Abstarct class constructor");
	}
	
	abstract public void test1();
	
	public void test() {
		System.out.println("Abstact Class implemented Interface");
	}
}

public class AbstractClassTest extends AbstractDemmo{

	public static void main(String... args) {
		
		//AbstractClassTest demo = new AbstractClassTest();
		//demo.test();
		
		//-------------------------------
		Integer i1 = 127;
		Integer i2 = 127;

		if (i1 == i2)
			System.out.println("true");
		else
			System.out.println("false");

		Integer integer3 = 300;
		Integer integer4 = 300;
		
		if (integer3 == integer4)
			System.out.println("true");
		else
			System.out.println("false");
		
		//-----------------------------
		//part 1
		final byte a = 1;
		final byte b = 2;
		byte c = a + b;
		System.out.println(c);

		//part 2
		byte i = 1;
		byte j = 2;
		//byte k = i + j;
		//System.out.println(k);
	
		
		int y = 123456789;
		float f = y;
		System.out.println(f);
	}

	@Override
	public String getClassification() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
}

class A {
	
	final void show() {
		
	}
}
