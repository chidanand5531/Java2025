package test;

import java.util.Arrays;
import java.util.Iterator;

public class AddNumbersFromArray {
	
	public static void main(String[] args) {
		
		
		String test="Input : 22rg(8)15+6:78\r\n";
		
		
		int sum=0;
		String[] str = test.replaceAll("[^0-9]", " ").split("");
		System.out.println(Arrays.toString(str));
		
		
		  for (int i = 0; i < str.length; i++) {
			  if(str[i].matches("[0-9]+")) { 
				  sum =sum+Integer.parseInt(str[i]); }
		  
		  }
		 

		System.out.println(sum); // 39
	}
}
