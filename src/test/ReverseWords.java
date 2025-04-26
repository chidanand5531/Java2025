package test;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		String str="John Smith";
		String[] s=str.split(" ");
		System.out.println("After splitting the String "+ Arrays.toString(s));
		String s1=s[1]+" "+s[0];
		System.out.println(s1);
		
		
		 // OR
		
		String rev=String.join(" ",s[1],s[0]);
		System.out.println(rev);


	}

}
