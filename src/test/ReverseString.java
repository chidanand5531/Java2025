package test;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="Chid";
		
	    int len=str.length();
	    
		/*String rev="";	
		
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("After reversing the string : "+rev); */
	    
	 // Logic2
	    
	 /*  char[] charArray = str.toCharArray();
	   String rev="";
	   
	  for (int i = str.length()-1; i>=0; i--) {
		  rev = rev+charArray[i];
		
	}
	  
	  System.out.println("After reversing the string : "+rev);
	    
 */
	
	 // Using StringBuffer
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		
	}

}
