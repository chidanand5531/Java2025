package reverseProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter numbers :");
		 
		 int num = sc.nextInt();
		 
		
		 
		/* int rev=0;
		 
		 while (num!=0) {
			rev=rev*10+num%10;    // 0*10+1234%10=0+4=4  // num%10 gives only last digit 
			num=num/10;           //1234/10=123  Eliminates the last digit
		}
		 
		 System.out.println("After reversing the number : " + rev);*/
		 
		 // Using StringBuffer
		 
		 StringBuffer sb=new StringBuffer(String.valueOf(num));
		 StringBuffer reverse=sb.reverse();
		 System.out.println("After reversing the number with StringBuffer: " + reverse);
		 

	}

}
