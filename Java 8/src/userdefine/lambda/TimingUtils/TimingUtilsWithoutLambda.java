package userdefine.lambda.TimingUtils;

import java.util.Arrays;

public class TimingUtilsWithoutLambda implements Op{
	
	private static final double ONE_BILLION = 1_000_000_000;
	
	public static void timeOp() {
		
		long startTime = System.nanoTime();
		new TimingUtilsWithoutLambda().runOp();
		long endTime = System.nanoTime();
		double elapsedSeconds = (endTime - startTime) / ONE_BILLION;
		System.out.printf(" Elapsed time: %.3f seconds.%n", elapsedSeconds);
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<2; i++) {			
			TimingUtilsWithoutLambda.timeOp();
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

	@Override
	public void runOp() {
		// TODO Auto-generated method stub
		int size = (int) Math.pow(10, 4);
		System.out.printf("Sorting array of length %,d.%n", size);
		sortArray(size);

	}
}
