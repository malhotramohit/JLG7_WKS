package edu.gyansetu.tcs.exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CompileTimeExp1 {

	public static void main(String[] args) {

		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void readFile() throws IOException {

		findFile();
	}

	private static void findFile() throws IOException {

		System.out.println("before exp");

		FileInputStream fileInputStream = new FileInputStream(
				"/Users/mohitmalhotra/JLG7_WKS/JLG7COREJAVA/src/edu/gyansetu/tcs/exceptionhandling/CompileTimeExp1.javda");
		System.out.println(Character.valueOf((char) fileInputStream.read()));
		System.out.println(Character.valueOf((char) fileInputStream.read()));
		System.out.println("after exp");

	}

}