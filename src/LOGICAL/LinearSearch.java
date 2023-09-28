package LOGICAL;

public class LinearSearch {
		public static int linear(int ar[],int key) {
			for(int i=0;i<ar.length;i++) {
				if(ar[i]==key) {
					return i;
				}
			}
			return -1;
		}
		
	public static void main(String[] args) {
			int a[] = {10,20,30};
			int key=20;
			System.out.println(key + " is found at index " +linear(a, key));
	}

}
