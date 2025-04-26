package test;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		
		int[] numbers = {10, 21, 33, 44, 55, 66, 77, 88, 99};
		
		System.out.println(" Even numbers are - ");
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i]%2==0) {
				System.out.print(numbers[i]+",");
			}
	
			}
		
		System.out.println(" Odd numbers are - ");
		for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]%2!=0) {
			System.out.print(numbers[i]+",");
		}
		}
	}
	}


