package test1;

public class ReplaceVowelsWithDollarByIncrement {

	public static void main(String[] args) {
		String str = "Tomorrow";
System.out.println(replaceVowelsWithDollar(str));
	}
	
	public static String replaceVowelsWithDollar(String str) {
		
        StringBuilder result = new StringBuilder();
        int dollarCount = 1;

        for (int i = 0; i < str.length(); i++) {  // Fixed loop to go till the last character
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result.append("$"); // Append `$` dollarCount times
                dollarCount++; // Increase dollar count for next vowel
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}
