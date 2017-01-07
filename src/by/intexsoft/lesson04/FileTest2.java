package by.intexsoft.lesson04;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest2 {
	public static final String BASE_DIR = "d:\\333\\";
	public static final String ADMIN = "ADMIN";

	public static void main(String[] args) throws IOException {
		createDir();
		String firstName = getString();
		String lastName = getString();
		if (firstName.equals(ADMIN) && lastName.equals(ADMIN)) {
			DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(BASE_DIR));
			for (Path file : stream) {
				if (file.toFile().isDirectory()) {
					System.out.println(file.getFileName());
				}
			}
		} else if (firstName.isEmpty() && lastName.isEmpty()) {
			DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(BASE_DIR));
			for (Path file : stream) {
					file.toFile().delete();
			}
		} else {
			createDir(firstName, lastName);
		}
	}

	private static void createDir(String firstName, String lastName) {
		String fullPath = BASE_DIR + "\\" + firstName.toUpperCase() + "_" + lastName.toUpperCase();
		new File(fullPath).mkdir();
	}

	private static String getString() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		return br.readLine();
	}

	private static void createDir() {
		File f = new File(BASE_DIR);
		if (f.exists()) {
			return;
		} else {
			new File(BASE_DIR).mkdir();
		}
	}
}
