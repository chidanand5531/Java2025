package test1;

public class ReplaceSpaces {
    public static String replaceSpaces(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                result.append('_');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World Java";
        System.out.println(replaceSpaces(input)); // Hello_World_Java
    }
}

