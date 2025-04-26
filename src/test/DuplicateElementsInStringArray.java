package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInStringArray {

	public static void main(String[] args) {
		
		String s = "test your app by test app technique";
		String[] str = s.split(" ");
		
		System.out.println(Arrays.toString(str));
		
		System.out.print("duplicate words are : ");
		
		Set<String> hs = new HashSet<>();

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i].equals(str[j])) {

					hs.add(str[i]);
					
				}
			}
		}
		
		for (String st : hs) {
			System.out.print( st+" ");
		}
	}

}
