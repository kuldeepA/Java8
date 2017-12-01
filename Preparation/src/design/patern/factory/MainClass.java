package design.patern.factory;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units = 10;
		PlanFactory fact = new PlanFactory();
		Plan plan = fact.getPlan("Domestic");
		plan.getRate();
		plan.calculate(units);
	}

}
