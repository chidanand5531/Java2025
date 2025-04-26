package test1;

public class FindLengthOfStringWithoutLengthMathod {

	public static void main(String[] args) {
		
		String s = "prepinsta";
		
		char ch[]=s.toCharArray();
		
		int length=0;
		
		for (char c : ch) {
			length++;
		}
		
		System.out.println("Length of given Word - "+length );

	}

}
