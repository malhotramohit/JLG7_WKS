package edu.gyansetu.tcs.oops.intro;

public class School {

	String name;
	int yearOfEst;
	int stdStr;

	public static void main(String[] args) {

		School school1 = new School();

		school1.name = "DPS";
		school1.stdStr = 34;
		school1.yearOfEst = 1993;

		System.out.println("school name is " + school1.name);
		System.out.println("school yearOfEst is " + school1.yearOfEst);
		System.out.println("school stdStr is " + school1.stdStr);

		// school name is null
		// school yearOfEst is 0
		// school stdStr is 0

		School school2 = new School();
		school2.name = "HPS";
		school2.stdStr = 89;
		school2.yearOfEst = 1998;

		System.out.println("school name is " + school2.name);
		System.out.println("school yearOfEst is " + school2.yearOfEst);
		System.out.println("school stdStr is " + school2.stdStr);
		
		


	}

}
