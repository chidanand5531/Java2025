package JavaNotes;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		int arr[]= {20,12,45,67,788};
		Arrays.sort(arr);
	
		String s="Welcome";
		System.out.println(s.length());
		
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) {
			rev+=s.charAt(i);
		}
		
		System.out.println(rev); // emocleW
// logic2
		char ch[]=s.toCharArray();
		
		String c="";
		System.out.println(Arrays.toString(ch));
		System.out.println(ch.length);
		
		for (int i = ch.length-1; i >=0; i--) {
			c += ch[i];
			
		}
		
		System.out.println(c);
	}

}
