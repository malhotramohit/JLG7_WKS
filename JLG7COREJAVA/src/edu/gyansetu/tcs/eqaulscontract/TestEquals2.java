package edu.gyansetu.tcs.eqaulscontract;

public class TestEquals2 {

	public static void main(String[] args) {

		Department department1 = new Department(1, "IT");
		Department department2 = new Department(1, "IT");


		Emp emp1 = new Emp(23, "Mohit", department1);

		Emp emp2 = new Emp(23, "Mohit", department2);

		if (emp1.equals(emp2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

	}

}