package codility.test;

public class HackerEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1,count=0;
        int arr[] =new int[]{9,38,95,29,22,15,49,34,70,93};
        int length = arr[0];
        for (int i=1; i<=length; i++) {
        n=1;    
        count = arr[i];
        while (n <=count) {
            
            if (n%15 == 0)
                System.out.println("FizzBuzz");
            else if (n%5 == 0)
                System.out.println("Buzz");
            else if (n%3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(n);
            n++;
        }}
	}

}
