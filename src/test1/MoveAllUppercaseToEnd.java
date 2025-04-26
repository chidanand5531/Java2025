package test1;

public class MoveAllUppercaseToEnd {
	
	public static void moveToEnd(String str) {
		
		String upper="";
		String lower="";

		for(int i=0; i<str.length(); i++) {
			
			if(Character.isUpperCase(str.charAt(i))) {
				upper=upper+str.charAt(i);
				
			} else {
				lower=lower+str.charAt(i);
			}
		}
		
		String aftermove=lower+upper;
		System.out.print(aftermove); 
	}

	public static void main(String[] args) {

		String str="JaGraT";
		
		moveToEnd(str); // araJGT
   

	}

}
