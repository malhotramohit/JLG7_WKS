package edu.gyansetu.tcs.collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> listOfNames = new ArrayList<Integer>();

		int age = 23;

		listOfNames.add(34);
		listOfNames.add(age);
		listOfNames.add(45);
		listOfNames.add(56);
		
		
		listOfNames.set(2,90);
		// listOfNames.add("moit");

		System.out.println("size is " + listOfNames.size());

		Object o = Integer.valueOf(listOfNames.get(0).toString());

		System.out.println(listOfNames.get(2));

		for (int i = 0; i < listOfNames.size(); i++) {
			System.out.println(listOfNames.get(i));
		}

	}

}