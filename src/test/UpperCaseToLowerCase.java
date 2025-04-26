package test;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {

		String str = "KriSHnA";
     /*   char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else {
                charArray[i] = Character.toUpperCase(c);
            }
        }
		
        System.out.println("Original String: " + str);
        String swappedStr = new String(charArray);
        System.out.println("Swapped Case String: " + swappedStr); */
		
		
		
		
		char[] charArray=new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				charArray[i]=Character.toLowerCase(str.charAt(i));
			} else {
				charArray[i]=Character.toUpperCase(str.charAt(i));
			}
			
		}
		
		System.out.println(charArray);
		
		new UpperCaseToLowerCase();


	}

	
	
}
