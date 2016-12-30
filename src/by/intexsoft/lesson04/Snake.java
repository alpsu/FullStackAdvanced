package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Snake {

	public static void main(String[] args) throws IOException {
		int numN = getInt();
		int[][] arr = new int[numN][numN];
		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numN; j++) {
				if (i % 2 == 0) {
					arr[i][j] = i * numN + j  + 1;
				} else
				{
					arr[i][j] = (i + 1) * numN - j ;
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
