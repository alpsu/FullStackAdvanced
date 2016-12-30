package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SpiralSnake {
	public static void main(String[] args) throws IOException {
		int numN = getInt();
		int[][] arr = new int[numN][numN];
		
		int row = 0;
		int col = 0;
		int dx = 1;
		int dy = 0;
		int dirChanges = 0;
		int visits = numN;
		
		for (int i = 0; i < numN * numN; i++)
		{
			arr[row][col] = i + 1;
			if (--visits == 0) {
                visits = numN * (dirChanges % 2) + 
                    numN * ((dirChanges + 1) % 2) -
                    (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
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