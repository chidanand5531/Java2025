	package test1;

	public class CountUpperLowerLetters {
	    public static void main(String[] args) {
	        String input = "HelloWorld";
	        int uppercase = 0, lowercase = 0;

	        for (char ch : input.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                uppercase++;
	            } else if (Character.isLowerCase(ch)) {
	                lowercase++;
	            }
	        }

	        System.out.println("Uppercase Letters: " + uppercase);
	        System.out.println("Lowercase Letters: " + lowercase);
	    }
	}

