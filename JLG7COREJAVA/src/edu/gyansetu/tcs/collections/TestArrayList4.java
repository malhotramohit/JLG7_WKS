package edu.gyansetu.tcs.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList4 {
	public static void main(String[] args) {

		ArrayList<Double> listOfYOE = new ArrayList<Double>(10);

		listOfYOE.add(12.5);
		listOfYOE.add(6.5);
		listOfYOE.add(4.4);
		listOfYOE.add(8.9);

		System.out.println("trad for loop");

		for (int i = 0; i < listOfYOE.size(); i++) {
			System.out.println(listOfYOE.get(i));
		}

		// start yoE : get(0)
		// yoE : get(1)
		System.out.println("for each loop");
		for (Double yoE : listOfYOE) {
			System.out.println(yoE);

		}

		// 12.5
		// Exception in thread "main" java.util.ConcurrentModificationException
		// at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
		// at java.util.ArrayList$Itr.next(ArrayList.java:859)
		// at edu.gyansetu.tcs.collections.TestArrayList4.main(TestArrayList4.java:25)

		// for(Acc account : acccs) {
		//
		// }

		System.out.println("iterator");
		Iterator<Double> iterator = listOfYOE.iterator();

		while (iterator.hasNext()) {

			//iterator.remove();
			iterator.next();
		}
		System.out.println("java 8 for each");
		
		listOfYOE.forEach(obj->{
			System.out.println(obj);
		});
		
		listOfYOE.forEach(System.out::println);

	}

}
