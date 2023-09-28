package LOGICAL;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Size ");
		int length = s.nextInt();
		int arr[] = new int[length];
		System.out.println("enter " + length + " elememts");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr [ " + i + " ]----> " + arr[i]);
		}
	}
}
