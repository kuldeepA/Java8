package basic.java;

class ThreadRun extends Thread{
	
	public synchronized void run() {
		
		for (int i=0; i<2700; i++)
			System.out.println("Count "+ i);
	}
}

class RunThrd1 {
	
	public RunThrd1() {
		ThreadRun run = new ThreadRun();
		run.start();
	}
}

class RunThrd2 {
	
	public RunThrd2() {
		ThreadRun run = new ThreadRun();
		run.start();
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunThrd1();
		new RunThrd2();
		
		new Thread() {
			
			@Override
			public void run() {
				System.out.println("Task Running !.....");
			}
		}.start();
		
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Task Runnable Running !.....");
			}
		}).start();
	}

}
