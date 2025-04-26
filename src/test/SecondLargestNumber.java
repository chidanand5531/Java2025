package test;

import java.util.Arrays;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		
		int arr[]= {3,1,8,8,9};
		
		int largest=0;
		int seclargest= 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>seclargest && arr[i]!=largest) {
				seclargest=arr[i];
				
			}
		}
		System.out.println("largest " + largest);
		System.out.println(seclargest);

		// 3 > 0 & 3!=9 yes then seclargest=3
		// 2 > 3 no
		// 8 > 3 & 8!=9 yes then seclargest=8
		// 8 > 8 & 8!=9 no
		// 9 > 8 & 9!=9 no
		
	}

}
