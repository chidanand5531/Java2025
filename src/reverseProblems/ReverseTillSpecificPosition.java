package reverseProblems;

public class ReverseTillSpecificPosition {
	
	public static void reverse(int arr[], int start, int end) {
		 
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}	
	}
	
	public static void print(int arr[]) {
		 for(Integer i:arr) {
			 System.out.print(i+ " ");
		 }
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		reverse(arr, 0,3);
		print(arr);

	}
	
	

}
