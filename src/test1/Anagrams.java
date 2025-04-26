package test1;

import java.util.Arrays;

public class Anagrams {
	
	public static void checkAnagram(String str1, String str2) {

		if(str1.length()!=str2.length()) {
			System.out.println("Both are not anagrams");
		} else  {
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Both are anagrams");
			}
			
		}
		
	}

	public static void main(String[] args) {
		checkAnagram("abcd", "dcba"); // Both are anagrams
		checkAnagram("abcd", "dcba1"); // Both are not anagrams
	}

}
