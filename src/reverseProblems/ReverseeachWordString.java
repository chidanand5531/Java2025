package reverseProblems;

public class ReverseeachWordString {

	public static void main(String[] args) {
		
		
		String inputString="Test your automation knowledge";

	    String[] parts = inputString.split(" ");
		
		  StringBuilder sb = new StringBuilder();
		  
		  for (String p : parts) {
		    sb.append(new StringBuffer(p).reverse().toString());
		    sb.append(' '); 
		   }
		  
		  System.out.println(sb.toString()); 
		
		
		
	}

}
