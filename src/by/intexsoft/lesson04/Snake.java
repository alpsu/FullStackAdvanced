package by.intexsoft.lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Snake {

	public static void main(String[] args) throws IOException {
		int numN = getInt();
		int[][] arr = new int[numN][numN];
		for (int outer = 0; outer < numN; outer++) {
			for (int inner = 0; inner < numN; inner++) {
				if (outer % 2 == 0) {
					arr[outer][inner] = outer * numN + inner  + 1;
				} else
				{
					arr[outer][inner] = (outer + 1) * numN - inner ;
				}
			}
		}
		printArray(arr);
	}
	
	private static String getString() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		return br.readLine();
	}
	
	private static int getInt() throws IOException {
		return Integer.parseInt(getString());
	}
	
	private static void printArray(int[][] array) {
		for (int[] tmp : array) {     
	        System.out.println(Arrays.toString(tmp));
	      }
	}
}
