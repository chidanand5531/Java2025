package test1;

public class SwapCornerWordR_ReverseMiddle {
	
	public static String revrse(String str) {
		
		String rev="";
		for (int i = str.length()-1; i >=0 ; i--) {
			rev=rev+str.charAt(i);
		}
		
		return rev;
	}
	
	public static void swapCandReverse(String str) {
		
		String req="";
		 String st[]=str.split(" ");
		 
		 for(int i=st.length-1; i>=0; i--) {
			 
			 if(i==0 || i==st.length-1) {  // checks only first and last word
				 req=req+st[i]+" "; 
			 } else {
				 req=req+ revrse(st[i])+" ";
			 }
		 }
		 
		 System.out.println("After swapping: "+ req);
	}

	public static void main(String[] args) {
		swapCandReverse("Hellow This is Chida"); // Chida si sihT Hellow 
 
	}

}
