package basic.java;

class Demo<T> {
	
	T t;
	
	public Demo(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}	

class Demo1<T1, T2> {
	
	T1 t1;
	T2 t2;
	
	public Demo1(T1 t1, T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}

	public T2 getT2() {
		return t2;
	}

	public void setT2(T2 t2) {
		this.t2 = t2;
	}
}

class Own<T> {
	
	T t;
	public Own(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class B {
	int i;
	public B(int i) {
		this.i = i;
	}
}

class MethodCon {
	
	public <T> MethodCon(T t1) {
		
	}
	
	public <T> void getGenericD(T t) {
		
	}
}

public class GenericDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo<String> sDemo = new Demo<String>("Generic- String Class");
		System.out.println(sDemo.getT());
		
		Demo<Integer> iDemo = new Demo<Integer>(89562);
		System.out.println(iDemo.getT());		
		
		Demo1<String, Integer> demo1 = new Demo1<String,Integer>("String", 98950);
		System.out.println(demo1.getT1()+"  "+demo1.getT2());
		
		Own<B> own = new Own<B>(new B(10));
		System.out.println(own.getT().i);
	}
}
