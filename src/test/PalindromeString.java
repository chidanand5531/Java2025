package test;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a String");
	 String str=sc.next();
	 
	 String originalStr=str;
	 String rev="";
	 
	 for (int i = str.length()-1; i >=0; i--) {
		rev=rev+str.charAt(i);
	}

	 if (originalStr.equals(rev)) {
		System.out.println(originalStr + " Is a Palindrome");
	} else {
		System.out.println(originalStr + " Is not a Palindrome");
	}
	 
	}

}
