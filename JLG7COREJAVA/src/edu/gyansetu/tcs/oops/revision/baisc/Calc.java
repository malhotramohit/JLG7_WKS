package edu.gyansetu.tcs.oops.revision.baisc;

public class Calc {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, double b) {
		return (int) (a + b);
	}


	public static int add(char a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b;
	}

	public static int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {

		int res = add(2, 3, 4);
		System.out.println("res is " + res);

	}

}