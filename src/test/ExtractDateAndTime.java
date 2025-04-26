package test;

import java.util.Arrays;

public class ExtractDateAndTime {

	public static void main(String[] args) {

  String s="#log@2021-12-12:13:15";
  // output = 2021+12+12+13+15
 System.out.println("Expected result : " + extractDate(s));
 
 // Logic2
 String str=s.replaceAll("[^0-9]", " ").trim(); // 
 System.out.println(str);
 String str1=str.replace(" ", "+");
  System.out.println("Expected result : " + str1);
 
	}
	
	
	// Logic1
	private static String extractDate(String s) {
		
		// The double backslash (\\) is used to escape the "-" character 
		//because in regular expressions, - can have a special meaning (indicating a range) 
		// like [^a-zA-Z0-9]
		
		String[] parts= s.split("[@\\-:]");
		System.out.println("After splitting the array: "+Arrays.toString(parts));
		String s1= parts[1]+"+"+parts[2]+"+"+parts[3]+"+"+parts[4]+"+"+parts[5];

		return s1;
	}

}
