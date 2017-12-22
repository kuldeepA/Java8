package userdefine.lambda.method.reference;

public class TestClass {

	public static double integrate(Integrable function, double x1, double x2, int numSlices) {
		
		if (numSlices < 1) {
			numSlices = 1;
		}
		double delta = (x2 - x1) / numSlices;
		double start = x1 + delta / 2;
		double sum = 0;
		for (int i = 0; i < numSlices; i++) {
			sum += delta * function.eval(start + delta * i);
		}
		return (sum);
	}
	
	public static void integrationTest(Integrable function, double x1, double x2) {
		
		//below code for testing how main method 4 lines are working. x*x means 2 times it will call and multiple its result
		//System.out.println(function.eval(5+5));
		for (int i = 1; i < 7; i++) {
			int numSlices = (int) Math.pow(10, i);
			double result = TestClass.integrate(function, x1, x2, numSlices);
			System.out.printf(" For numSlices =%,10d result = %,.8f%n", numSlices, result);
		}
	}

	public static void main(String[] args) {
		
		
		TestClass.integrationTest(x -> x*x, 10, 100);				//here x is Integrable instance. one x represent for Integrable method eval call.
		TestClass.integrationTest(x -> Math.pow(x,3), 50, 500);
		TestClass.integrationTest(Math::sin, 0, Math.PI);
		TestClass.integrationTest(Math::exp, 2, 20);
	}
}
