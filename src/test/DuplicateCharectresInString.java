package test;

import java.util.HashSet;

public class DuplicateCharectresInString {

	public static void main(String[] args) {

		String s = "indonesiain";
		System.out.print("duplicate charecters are : ");
		HashSet<Character> hs = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {

					hs.add(s.charAt(i));
				}
			}
		}
		
		for (Character character : hs) {
			System.out.print( character+" ");
		}
	}

}
