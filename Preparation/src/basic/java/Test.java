package basic.java;

abstract class Abs {
	
	public Abs() {
		System.out.println("Abstract class");
		print();
	}
	
	public abstract void print();
}

public class Test extends Abs{
	
	Integer i;
	public Test() {
		
		i = new Integer(5);
		System.out.println("Mail class");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method implemented");
	}
	
	public static void main(String...strings) {
		Test t = new Test();
		System.out.println(t.i);
	}

}
