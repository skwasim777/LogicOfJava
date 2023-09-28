package LOGICAL;

// selection sort is the process of sorting and searching the element 

public class SelectionSort {
		public static void main(String[] args) {
			int s[]= {38,52,9,18,6,62,13};
		//	int s[]= {8,9,0,3,9,4,1};
			int min;
			int temp=0;
			for(int i=0;i<s.length;i++) {
				min=i;
				for(int j=i+1;j<s.length;j++) {
					if(s[j]<s[min]) {
							min=j;
					}
				}
				temp=s[i];
				s[i]=s[min];
				s[min]=temp;
			}
			for(int i=0;i<s.length;i++) {
				System.out.println(s[i]+" ");
			}		}
}
