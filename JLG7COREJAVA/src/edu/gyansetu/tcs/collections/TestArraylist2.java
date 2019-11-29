package edu.gyansetu.tcs.collections;

import java.util.ArrayList;

public class TestArraylist2 {

	public static void main(String[] args) {

		// 1) dynamic array
		ArrayList<Integer> integers = new ArrayList<>(5);

		integers.add(23); // Integer.valueOf(23) new Intgere(23)
		integers.add(26);
		integers.add(19);
		integers.add(-9);
		integers.add(23);
		integers.add(26);
		integers.add(19);
		integers.add(-9);

		System.out.println("size is " + integers.size());

		displayListData(integers);

		ArrayList<Integer> integers2 = new ArrayList<>(5);
		integers2.add(2300);
		integers2.add(2600);
		integers2.add(1900);

		integers.addAll(integers2);

		System.out.println("after add all");

		displayListData(integers);

		// integers.clear();
		// based on index
		integers.remove(Integer.valueOf(-9));
		
		displayListData(integers);
	}

	private static void displayListData(ArrayList<Integer> integers) {

		if (!integers.isEmpty()) {

			for (int i = 0; i < integers.size(); i++) {
				System.out.println(integers.get(i));
			}
		} else {
			System.out.println("list is empty");
		}
	}

}