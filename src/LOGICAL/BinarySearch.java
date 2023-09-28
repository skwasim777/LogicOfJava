package LOGICAL;

// program for binary search 
public class BinarySearch {
	public static void main(String[] args) {
			int []arr = {1,2,3,4,5,6,7,8,9};
			int li=0;
			int hi=arr.length-1;
			int mi=(li+hi)/2;
			int key=7;
			while(li<=hi) {
				if(arr[mi]==key) {
					System.out.println("index persent at " + mi + " possition");
					break;
				}
				else if(arr[mi]< key) {
					li = mi+1;
				}
				else {
					hi = mi-1;
				}
				mi=(li+hi)/2;
			}
	}
}
