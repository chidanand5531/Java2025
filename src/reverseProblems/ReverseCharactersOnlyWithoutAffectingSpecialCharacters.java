package reverseProblems;

public class ReverseCharactersOnlyWithoutAffectingSpecialCharacters {
	
	public static void main(String[] args) {
		String input = "abc$def&gh$";
		
		System.out.println(reverse(input));
	}
	
	public static String reverse(String str) {
		
		char[] ch= str.toCharArray();
		
		int i=0;
		int j=ch.length-1;
		
		while(i<j) {
			if(!Character.isAlphabetic(ch[i])) {
				i++;
			}else if(!Character.isAlphabetic(ch[j])) {
				j--;
			}
          
          if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j])) {
        	  char temp=ch[i];
        	  ch[i]=ch[j];
        	  ch[j]=temp;
        	  
				i++;
				j--;
			}
			
		}
		return new String(ch);	
	}
	
	

}
