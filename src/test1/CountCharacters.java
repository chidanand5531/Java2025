package test1;

public class CountCharacters {
    public static void main(String[] args) {
        String input = "Hello123@#";
        int letters = 0, digits = 0, specialChars = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChars++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}

