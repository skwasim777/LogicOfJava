package LOGICAL;

public class InsertionSort {
		public static void main(String[] args) {
			int a[] = {6,1,4,2,3,5};
			int temp=0;
			int j=0;
			for(int i=1;i<a.length;i++) {
				temp=a[i];
				j=i;
				while(j>0&&a[j-1]>temp) {
					a[j]=a[j-1];
					j=j-1;
				}
				a[j]=temp;
			}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]+" ");
			}
		}
}
