package design.patern.factory;

public abstract class Plan {
	
	protected double rate;
	abstract void getRate();
	
	void calculate(int units) {
		System.out.println(units*rate);
	}
}
