package reverseProblems;

public class ReverseOnlyChars {

	public static void main(String[] args) {


			String input="AT2025test";
			
            String letters=input.replaceAll("[^A-Za-z]", "");
            System.out.println(letters);
            
            String rev="";
           char[] arr= letters.toCharArray();
           
           for (int i = arr.length-1; i >=0; i--) {
			rev+=arr[i];
		}
           
           System.out.println("Reverse charecters : " + rev);
	} 

}
