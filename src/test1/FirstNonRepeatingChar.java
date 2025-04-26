package test1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String input = "swiss";
        System.out.println(findFirstNonRepeating(input)); // Output: w
    }
}

