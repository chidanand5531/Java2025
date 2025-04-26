package test;

import java.util.HashMap;
import java.util.Map;

public class FindTheCountOfCharacters {
	
	public static void main(String[] args) {
		
			// String s = "AAAABBCCCDDDDZZAZBB";
			 
			 // OR
			 String lowerCaseString = "AAaaCCCDDDDAzb";
			 String s = lowerCaseString.toLowerCase();
		 
	        // Create a map to store the count of each character
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        // Traverse the string
	        for (int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            
	            // If the character is already in the map, increment its count
	            if (charCountMap.containsKey(currentChar)) {
	                charCountMap.put(currentChar, charCountMap.get(currentChar) + 1);
	            } else {
	                // Otherwise, add it with count 1
	                charCountMap.put(currentChar, 1);
	            }
	        }
	        
	         int maxNum=0;
	         int minNum=0;
	         
	         Character c=' ';
	         Character d=' ';

	        // Print the occurrence of each character
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	          // System.out.print(entry.getKey() + "" + entry.getValue());

	            	if(entry.getValue()>maxNum) {
	    				maxNum=entry.getValue();
	    				c=entry.getKey();
	    			} else if (entry.getValue()==1) {
	    				minNum=entry.getValue();
	    				d=entry.getKey();
	    			}
	            }
	        
	        System.out.println(c+ "--occured highest times "+maxNum);
	        System.out.println(d+ "--occured lowest times "+minNum);
	        }
	}
	
	

