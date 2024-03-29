package edu.gyansetu.tcs.strings;

public class TestString1 {

	public static void main(String[] args) {

		// way 1
		String name = "Mohit"; // ['M' , 'o' , 'h', 'i' , t'']

		// way 2
		String lastName = new String("Malhotra");

		int index = name.indexOf('i');
		System.out.println("index of i is " + index);

		char someChar = lastName.charAt(5);

		System.out.println(" someChar is " + someChar);

		System.out.println(name.concat(lastName));

		// constant pool
		// 1) new obj : heap
		// 2) pool : cache
		// String str1 = "abc";// abc - > 1000
		// int age =90;
		// String str2 = "abc";// abc - > 1000

		String str1 = new String("abc"); // abc - > 1000
		String str2 = new String("abc"); // abc - > 2000

		char[] atr = new char[3];

		if (str1 == str2) { // not comparing internal : ref values
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		if (str1.equals(str2)) { // comparing internal : not ref values
			System.out.println("same using equals");
		} else {
			System.out.println("diff using equals");
		}

		// String is immutable :
		// name - > "Mohit" : deferenced : no body is referencing : Cache POOl
		// name -> MOHIT
		name = name.toUpperCase();

		String name2 = "Mohit"; // name2 - > "Mohit"

		System.out.println("name in upper " + name);

		System.out.println("sub string " + name2.substring(2, 5));

		name2 = name2.replace('M', 'R');

		System.out.println(name2);

		String str4 = "abc";
		String str5 = "cwertyuio";

		int i = str4.compareTo(str5);
		System.out.println("diff is " + i);

		int lendiff = str4.length() - str5.length();

		System.out.println(lendiff);

		String email = "   mmal @hh.com   ";
		email = email.trim();
		System.out.println("emmial is=" + email);

		if (name2.startsWith("R")) {
			System.out.println("yes starting with R");
		}

		int a = 2;
		int b = 3;

		System.out.println(a + b + name2); // 5 Rohit :
		System.out.println(name2 + a + b); // Rohit23
		System.out.println(a + name2 + b); // 2Rohit3

		name2.substring(2).toUpperCase().replace('e', 'g');
		
		System.out.println(name2);
		
		
		String data = "Mohit Rohit Sumit Amit";
		
		String[] dataArr = data.split(" ");
		
		for (int j = 0; j < dataArr.length; j++) {
			System.out.println(dataArr[j]);
		}
		
		

	}

}
