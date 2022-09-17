package edu;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
public class Total2 {

	public static void main(String[] args) {
		
		String address = "httpL///acebook.com/profiles/mahirlabib";
		URL pageLocation = new URL(address);
		Scanner in = new Scanner(pageLocation.openStream());
		
		
		File inputFile = new File("C:\\homework\\input.dat");
		Scanner console = new Scanner(System.in);
		System.out.print("Insert input file");
		String inputFileName = console.next();
		System.out.print("Insert output file");
		String OutputFieName = console.next();
		
		File file = new File(inputFileName);
		Scanner in = new Scanner(file);
		PrintWriter out = new PrintWriter(OutputFieName);
		double total = 0;
		while(in.hasNextDouble()) {
			double value = in.nextDouble();
			outprintf("%15.2f/n" , value);
			total = total + value;
		
		}
		out.printf("Total: %15.2f\n", total);
		in.close();
		out.close();
		console.close();
		
	}
}
