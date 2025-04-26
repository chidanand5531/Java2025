package test1;

public class ExtractDigits {

	public static String extractDigits(String str) {
		
        StringBuilder digits = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        return digits.toString();
    }

    public static void main(String[] args) {
        System.out.println(extractDigits("abc123xyz")); // 123
    }

}
