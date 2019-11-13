
public class Array2 {

	public static void main(String[] args) {

		int[] array1 = { 23, -89, 67, 45, 34, 20, -69 };

		int max = array1[0];

		for (int i = 1; i < array1.length; i++) {

			if (max < array1[i]) {
				max = array1[i];
			}

		}

		System.out.println("max is " + max);

		// 23, -89, 67, 45, 34, 20

		// -89 23 67 45 34 20
		// -89 23 67 45 34 20
		// -89 23 45 67 34 20
		// -89 23 45 34 67 20
		// -89 23 45 34 20 67

		// -89 23 45 34 20 67

		bubbleSort(array1);

		System.out.println("after sorting");

		displayArrayElements(array1);

	}

	private static void displayArrayElements(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

	}

	// -89 -69 20 23 34 45 67

	private static void bubbleSort(int[] array1) {
		// 23, -89, 67, 45, 34, 20
		// 2 3 4 5 6 7 8
		boolean isSorted = true;
		for (int j = 0; j < array1.length; j++) {
			int temp = 0;
			for (int i = 0; i < array1.length - j - 1; i++) {
				if (array1[i] > array1[i + 1]) {
					temp = array1[i + 1];
					array1[i + 1] = array1[i];
					array1[i] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}

	}
}
