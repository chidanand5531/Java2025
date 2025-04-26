package test1;

public class PasswordValidator {

	    public static boolean isValidPassword(String password) {
	        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

	        if (password.length() < 8) return false;

	        for (char ch : password.toCharArray()) {
	        	
	            if (Character.isUpperCase(ch)) 
	            	hasUpper = true;
	            else if (Character.isLowerCase(ch)) 
	            	hasLower = true;
	            else if (Character.isDigit(ch)) 
	            	hasDigit = true;
	            else 
	            	hasSpecial = true;
	        }

	        return hasUpper && hasLower && hasDigit && hasSpecial;
	    }

	    public static void main(String[] args) {
	        System.out.println(isValidPassword("P@ssw0rd")); // true
	    }
	}


