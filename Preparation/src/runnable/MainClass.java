package runnable;

public class MainClass {

	public static void main(String[] args) {
		
		Demo d1 = new Demo("Hello","There");
		Thread t1 = new Thread(d1);
		Demo d2 = new Demo("How are","You ?");
		Thread t2 = new Thread(d2);
		Demo d3 = new Demo("ThankU","Very much!");
		Thread t3 = new Thread(d3);
		t1.start();
		t2.start();
		t3.start();
	}

}
