package test1;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentLetter {
    public static char findMostFrequentLetter(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        char mostFrequent = ' ';
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
                if (freqMap.get(ch) > maxCount) {
                    maxCount = freqMap.get(ch);
                    mostFrequent = ch;
                }
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "hellooo";
        System.out.println(findMostFrequentLetter(input)); // Output: o
    }
}

