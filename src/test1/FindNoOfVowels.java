package test1;

public class FindNoOfVowels {

	public static void main(String[] args) {
		
		 String str = "hello world";
		 
		 String isVowel="aeiouAEIOU";

		 for (int i = 0; i < str.length()-1; i++) {
			if(isVowel.indexOf(str.charAt(i))!=-1) {
				System.out.print(str.charAt(i)+" ");
			}
		}
	}
	
	/*String vowels = "aeiouAEIOU"; // String containing all vowels

	 System.out.println(vowels.indexOf('a')); // Output: 0 (Found at index 0)
	 System.out.println(vowels.indexOf('o')); // Output: 3 (Found at index 3)
	 System.out.println(vowels.indexOf('z')); // Output: -1 (Not found)
	 System.out.println(vowels.indexOf('I')); // Output: 7 (Found at index 7) */

}
