package edu.gyansetu.tcs.oops.revision.baisc;

public class AccTest {

	public static void main(String[] args) {

		Acc acc1 = new Acc(3434, "Current");

		System.out.println(acc1.getAccNum());
		System.out.println("after changing");

		// acc1.setAccNum(acc1,9898);

		System.out.println(acc1.getAccNum());

		Acc acc2 = new Acc(3434, "Current");

		// acc2.setAccNum(acc2,9898);
		//edu.gyansetu.tcs.oops.revision.baisc.Acc@33909752

		System.out.println(acc2);
	}

}