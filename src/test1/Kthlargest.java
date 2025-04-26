package test1;

public class Kthlargest {

	public static void main(String[] args) {
		
		// 3rd largest element
		int a[] = { 5, 8, 12, 7, 6, 2, 4, 5 };
		
		int temp;
		int k=4;
		
		for(int i=0; i<a.length-1; i++) {
			
			for(int j=i+1; j<a.length-1; j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			if(i==k-1) {
				System.out.println("Kth largest element is - "+ a[i]);
				break;
			}
		}

	}

}
