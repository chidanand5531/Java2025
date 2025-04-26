package test;

public class MaxMinElementsInAnArray {

	public static void main(String[] args) {


		int arr[]= {20,4,60,-23,0,45,5};
		
		int maxNum=0;
		int minNum=0;
		
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]>maxNum) {
				maxNum=arr[i];
			} else if (arr[i]< minNum) {
				minNum=arr[i];
			}
		}
		
		System.out.println("MaxNum : " + maxNum +" MinNum : "+ minNum);

	}

}
