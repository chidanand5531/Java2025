package test;

import java.util.Arrays;

public class ExtractOnlyDigits {

	public static void main(String[] args) {

		 String str="Guru100Pajitester2025";
		    // GuruPajitester
		    
		    // Aproach 1
		  // System.out.println("Message "+  str.replaceAll("[^a-zA-z]", ""));
		   
		   // Aproach Guru100Pajitester2025
		   
		   char[] ch=str.toCharArray();
		   System.out.println(Arrays.toString(ch));
		   
		   StringBuffer sd= new StringBuffer();
		   
		   for(int i=0; i<ch.length; i++){
		       
		        if(!Character.isDigit(ch[i])){ 
		        	sd.append(ch[i]);
		        } 
		   }
		   
		   System.out.println("Message "+ sd.toString());
		
	}

}
