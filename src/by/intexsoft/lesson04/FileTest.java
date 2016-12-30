package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest {
	public static String STRING_ADD = " - Проверено\n"; 
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sourceFileName = reader.readLine();
		String destinationFileName = reader.readLine();

		reader = new BufferedReader(new FileReader(sourceFileName));
		BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));

		String line;
		String tmp;
		while ((line = reader.readLine()) != null) {
			tmp = line + STRING_ADD;
			writer.write(tmp);
		}

		writer.close();
		reader.close();
	}

}

