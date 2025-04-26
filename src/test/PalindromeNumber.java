package test;

import java.util.Scanner;

public class PalindromeNumber {
	// Palindrome number is a number, we get the same as result after reversing
	// e.g 16461
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");

		int num=sc.nextInt();
		
		int originalnum=num;
		int rev=0;
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(originalnum==rev) {
			System.out.println("Given number is palindrome" + originalnum);
		}else {
			System.out.println("Given number is palindrome" + originalnum);
		}
		
		
	}

}
