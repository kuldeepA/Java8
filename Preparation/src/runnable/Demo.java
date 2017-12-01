package runnable;

public class Demo implements Runnable{

	private String s1, s2;
	public Demo(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		
		new Display().print(s1,s2);			
	}
}
