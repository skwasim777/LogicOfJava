package LOGICAL;

public class BubleSort {
	public static void main(String[] args) {
		int[] a = { 10, 20, 11, 9, 8, 3, 2, 4, 1 };
		int temp = 0;
		// loop to access the each element of array

		for (int i = 0; i < a.length; i++) {

			// loop to compare the array element

			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
