package test;
import java.util.*;

public class Program1 {
	
 public static void main (String[] args) {
	  
	 String input="AutomationTEST";
	 
	 // convert to uppercase to lower case and reverse
	 
	 StringBuffer sb=new StringBuffer();
	 
	 for (int i = 0; i < input.length()-1; i++) {
		if(Character.isUpperCase(input.charAt(i))) {
			sb.append(Character.toLowerCase(input.charAt(i)));
		} else if(Character.isLowerCase(input.charAt(i))) {
			sb.append(Character.toUpperCase(input.charAt(i)));
		}else {
			sb.append(input.charAt(i));
		}
	}
	 
	 System.out.print(sb.toString());
	 
	 
	  }
	  
	}
	

