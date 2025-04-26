package test;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String st="My name is ABC";
		String str= st.toLowerCase();
		
		  Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count occurrences of each character
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Find the first non-repeated character
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	        	System.out.println(entry.getKey()+" " +entry.getValue());
	            }
	        }

 }
  





	

	
	

