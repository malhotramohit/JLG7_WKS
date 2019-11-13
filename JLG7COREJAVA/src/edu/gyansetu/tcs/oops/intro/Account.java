package edu.gyansetu.tcs.oops.intro;

public class Account {

	static int accNo = 90;
	private String accType;

	Account(int accNum) {
		System.out.println("Account called");
		accNo = accNum;
	}

	void Account() {
		System.out.println("Account called");

	}

	Account(int accNum, String accTy) {
		System.out.println("Account called");
		accNo = accNum;
		accType = accTy;
	}

	
	public static void main(String[] args) {
		System.out.println(new Account(3343).accType);
	}
	

	static {
		System.out.println("i am static block 1");
		accNo = 99;
		System.out.println("value in sttaic block 1 is "+ accNo);
	}
	
	static {
		System.out.println("i am static block 2");
		accNo = 999;
		System.out.println("value in sttaic block  2 is "+ accNo);
	}

	static int add(int a, int b) {
		return a + b;
	}

}
