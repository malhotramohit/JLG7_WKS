package edu.gyansetu.tcs.oops.intro.inheritance;

public class Employee {

	protected String name;
	protected String address;
	protected double exp;

	public void doCommonThings() {
		System.out.println("From emp ::doCommonThings ");
	}

	public  void displayData() {
		System.out.println(" emp is displaying some data");
	}

}
