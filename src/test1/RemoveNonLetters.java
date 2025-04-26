package test1;

public class RemoveNonLetters {
    public static String removeNonLetters(String str) {
    	
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "H3ll@ W0rld!";
        System.out.println(removeNonLetters(input)); // Output: "HllWrld"
    }
}

