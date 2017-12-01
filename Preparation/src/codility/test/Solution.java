package codility.test;

public class Solution {

	static int segregate(int arr[], int size) {
		int j = 0, i;
		for (i = 0; i < size; i++) {
			if (arr[i] <= 0) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				j++;
			}
		}

		return j;
	}

	static int findMissingPositive(int arr[], int size) {
		int i;

		for (i = 0; i < size; i++) {
			if (Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
		}

		for (i = 0; i < size; i++)
			if (arr[i] > 0)
				return i + 1;
		return size + 1;
	}

	static int findMissing(int arr[], int size) {

		int shift = segregate(arr, size);
		int arr2[] = new int[size - shift];
		int j = 0;
		for (int i = shift; i < size; i++) {
			arr2[j] = arr[i];
			j++;
		}

		return findMissingPositive(arr2, j);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 7, 8 };
		int arr_size = arr.length;
		int missing = findMissing(arr, arr_size);
		System.out.println("smallest positive missing number is " + missing);
	}
}
