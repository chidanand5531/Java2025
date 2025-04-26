package test;

import java.util.Arrays;

public class FirstCharacterOfWord {
	
	public static void main(String[] args) {
		
		
		String str= "Hi Chidanand how are you ";

		String[] strArray = str.split(" ");
		
		//System.out.print(Arrays.toString(strArray));
		
		for (String word : strArray) {
			
			char firstletter=word.charAt(0);
			
			System.out.print(firstletter+" ");
		}
		
		
		
	}

}