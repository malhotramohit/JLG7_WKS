
public class Array1 {

	public static void main(String[] args) {

		int[] days = new int[6];

		// { 23, 45, -90, 56 };

		// System.out.println(days[4]);
		
		for (int i = 0; i < days.length; i++) {
			days[i] = i+8;
		}

		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);

		}

	}

}
