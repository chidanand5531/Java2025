package test;

public class CountSumOfDigits {

	public static void main(String[] args) {

		int num=1234;
		
		int sum=0;
		
		while (num>0) {
			sum=sum+num%10;  // num%10 --->remainder of the number - 4
			num=num/10;      // num/10 --->It eliminates the last digit 1234/10 = 123
		}
		
		System.out.println("Sum of digits= "+ sum);
		
	}

}
