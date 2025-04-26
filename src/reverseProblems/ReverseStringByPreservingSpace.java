package reverseProblems;

import java.util.Arrays;
import java.util.Map;

public class ReverseStringByPreservingSpace {

	public static void main(String[] args) {
	
		
		String str="My name is Java";

		
		System.out.println(str.length());
		
	// o/p= av aJsi em anMy
		
		/* Remove the space by replaceAll method
		 * Reverse using Stringbuffer calss
		 * Use for loop to iterate over original string 
		 * If string has space then insert the space in stringbuffer reference
		 * 
		 * */
		
		String arr=str.replaceAll(" ", "");
		// System.out.print(arr);
       StringBuffer sb =new StringBuffer(arr);
       System.out.println(sb.reverse());
       
       for (int i = 0; i < str.length()-1; i++) {
    	   
    	   if (str.charAt(i) == ' ') {
    		   sb.insert(i, " ");
    		   
    	   }
		
	}
       
       System.out.println(sb);

	}

}
