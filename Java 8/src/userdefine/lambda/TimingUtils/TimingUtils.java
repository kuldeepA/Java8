package userdefine.lambda.TimingUtils;

import java.util.Arrays;

public class TimingUtils {

	private static final double ONE_BILLION = 1_000_000_000;

	public static void timeOp(Op operation) {
		
		long startTime = System.nanoTime();
		operation.runOp(); //if we remove this line lambda will not work. This is alternative for implements Op and override runOp
		long endTime = System.nanoTime();
		double elapsedSeconds = (endTime - startTime) / ONE_BILLION;
		System.out.printf(" Elapsed time: %.3f seconds.%n", elapsedSeconds);
	}
	
	public static void main(String []args) {
		
		for(int i=3; i<5; i++) {
			int size = (int)Math.pow(10, i);
			System.out.printf("Sorting array of length %,d.%n", size);
			TimingUtils.timeOp(() ->  sortArray(size));
			/*
			 * Here : () defined for interface method runOp() and sortArray(size) comes under its body [when we implements its body in case of normal scenario.]
			 * So if we remove lambda then we should implements its method runOp() and within this method I need to call sortArray() method, ons sortArray
			 * method finish its job then again time will calc and show the time consumed by this method. but in case of lambda line-12 operation.runOp()
			 * will give control again to line 23 lambda expression and call sortArray method.
			 * For without lambda see the class TimingUtilsWithoutLambda in same package.
			 */
		}
	}

	public static double[] randomNums(int length) {
		double[] nums = new double[length];
		for (int i = 0; i < length; i++) {
			nums[i] = Math.random();
		}
		return (nums);
	}

	public static void sortArray(int length) {
		double[] nums = randomNums(length);
		Arrays.sort(nums);
	}
}
