import java.util.*;
public class Sorted {
	
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
	void recur_insert(int ar[],int n) 
	
    {
		if (n <= 1) 
            return; 
		recur_insert(ar,n-1); 
        int last = ar[n-1]; 
        int j = n-2; 
        while (j >= 0 && ar[j] > last) 
        { 
            ar[j+1] = ar[j]; 
            j--; 
        } 
        ar[j+1] = last; 
        
    } 
	
	public void show() {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorted ob = new Sorted();
		ob.input();
		System.out.println("The Original Array is :- ");
		ob.show();
		ob.recur_insert(ob.ar,ob.ar.length);
		System.out.println("The Sorted Array is :- ");
		ob.show();
	}

}
