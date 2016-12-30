package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Piramid {
	public static void main(String[] args) throws IOException {
		int numN = getInt();
		int[][] arr = new int[numN][numN];

		for (int step = 0; step < numN / 2 + 1; step++) {
			for (int outer = step ; outer < numN - step ; outer++) {
				for (int inner = step; inner < numN -step; inner++) {
					arr[outer][inner] = step + 1;
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
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}