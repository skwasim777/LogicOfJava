package LOGICAL;

import java.util.Arrays;

public class AddElementIntoArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6, 7 };
		int n = arr.length;
		int addelement = 3;
		int[] a = new int[n + 1];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			a[i] = arr[i];
		}
		a[n] = addelement;
		System.out.println(Arrays.toString(a));
	}
}
