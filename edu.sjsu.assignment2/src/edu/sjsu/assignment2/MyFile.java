package edu.sjsu.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class MyFile {

	public static void writePrimes(String file1, String file2) throws IOException {
		File inputFile = new File(file1);
		Scanner scan = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(file2);

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner lineReader = new Scanner(line);
			lineReader.useDelimiter(",");
			while (lineReader.hasNext()) {
				String str = lineReader.next();
				
				try {

					int num = Integer.parseInt(str.trim());
					if (isPrime(num)) {

						out.println(num);
					}

				} catch (Exception e) {
					System.out.println(str + " is not number");
				}
			}
			lineReader.close();
		}
		scan.close();
		out.close();

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int index = 2; index <= number / 2; index++) {
			if ((number % index) == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		writePrimes("file1", "file2");

	}
}
