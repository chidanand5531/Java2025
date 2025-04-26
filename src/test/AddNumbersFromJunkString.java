package test;

import java.util.Arrays;

public class AddNumbersFromJunkString {

	public static void main(String[] args) {
		
		String str="Wipro2026testing03";
		
		String[] strArr = str.replaceAll("[^0-9]", "").split("");
		
		System.out.println(Arrays.toString(strArr));
		
		int sum=0;
		
		for (int i = 0; i < strArr.length; i++) {
			sum=sum+Integer.parseInt(strArr[i]);
		}
		
		System.out.println(sum); // 13
	}

}
