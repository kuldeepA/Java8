package codility.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

class Flower {
	String name;
	public Flower(String name) {
		this.name = name;
	}
}

class A{
	int add(int i, int j) {
			return i+j;
	}
}

class Square{
	public Square() {}
	
}

public class UBSTest extends Square implements Serializable/*extends A*/{

	/*public void print (Integer i) {
		System.out.println("i"+i);
	}
	public void print (String s) {
		System.out.println("s"+s);
	}*/
	
	
	private Square s = new Square();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UBSTest test = new UBSTest();
		try {
			FileOutputStream out = new FileOutputStream("Forest.ser");
			ObjectOutputStream os = new ObjectOutputStream(out);
			os.writeObject(test); os.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/*short s = 0;
		System.out.println(add(s,7));*/
		
		//main(args);
		/*HashMap<Flower,String> map = new HashMap<>();
		map.put(new Flower("Rose"), "Rose 120");
		map.put(new Flower("Lotus"), "Lotus 100");
		Flower f = new Flower("Rose");
		System.out.println(map.get(f));
		System.out.println(map);*/
		
		/*String str[] = new String[] {"abc"};
		
		try{
			proces(str);
		}catch(Exception e) {
			e.printStackTrace();
			proces(str);
		}*/
		/*String str[] = new String[] {"xyz","abc"};
		main(str[0]);*/
		/*synchronized(args) {
			try {
				args.wait();
				args.notify();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}*/
	}

	private static void main(String string) {
		
		System.out.println(string);
	}

	private static int proces(String[] str) {
		// TODO Auto-generated method stub
		return Integer.parseInt(str[0]);
	}

}
