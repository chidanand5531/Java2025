package test1;

public class ConvertcharacterTooppositecase {

	public static String toggleCase(String str) {
		
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Keep digits and special characters unchanged
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "HeLLo WoRLd! 123";
        System.out.println(toggleCase(input));  
        // Output: "hEllO wOrlD! 123"
    }
	
}


