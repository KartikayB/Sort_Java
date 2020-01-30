import java.util.*;
public class InsertionSort {
	
	int ar[];
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements = ");
		int n = sc.nextInt();
		ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element = ");
			ar[i]=sc.nextInt();
		}
	}

	public void arrange() {
		System.out.println("The Original Array is :- ");
		show();
		for(int i=1;i<ar.length;i++) {
			int ele=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>ele) {
				ar[j+1]=ar[j];
				
				j-=1;
			}
			ar[j+1]=ele;
		}
		System.out.println("The Sorted Array is :- ");
		show();
	}
	
	public void show() {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort ob = new InsertionSort();
		ob.input();
		ob.arrange();

	}

}
