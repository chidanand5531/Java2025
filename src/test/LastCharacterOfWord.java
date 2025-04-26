package test;

public class LastCharacterOfWord {
	
public static void main(String[] args) {
		
		
		String lastChar= "Hi Chidanand how are you ";
		lastChar(lastChar);


}

		public static void lastChar(String str) {
			String[] strArray = str.split(" ");
			
			for (String word : strArray) {
				
				char firstletter=word.charAt(word.length()-1);
				
				System.out.print(firstletter);
			}
		
}
}