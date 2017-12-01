package runnable;

public class Display {

	static /*synchronized*/ void print(String s1, String s2) {
		
		System.out.println(s1);
		try {
			Thread.sleep(900);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(s2);		
	}
}
