package codility.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HckrEarth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String[] sarry1 = br.readLine().split(" ");
        String[] sarry2 = br.readLine().split(" ");
        int []array  = new int[N];
        int []array2  = new int[N];
        for (int i=0; i<N; i++) {
        	array[i] = Integer.parseInt(sarry1[i]) + Integer.parseInt(sarry2[i]); 
        }
        for (int i=0; i<N; i++)
        	System.out.println(array[i]);
	}

}
