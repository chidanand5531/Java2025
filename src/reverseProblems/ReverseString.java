package reverseProblems;

public class ReverseString {

	public static void reverse1(String str) {
		
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("After Reversing : " + rev);
		
	}
	
public static void reverse2(String str) {
		
		String rev="";
		char[] ch=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+ch[i];
		}
		System.out.println("After Reversing : " + rev);
		
	}

public static void reverseWithStrBuffer(String str) {
	StringBuffer sb=new StringBuffer(str);
	String rev=sb.reverse().toString();
	System.out.println("After Reversing : " + rev);
	
}

public static void reverseWithStrBuilder(String str) {
	StringBuilder sb=new StringBuilder();
	System.out.println("After Reversing : " + sb.append(str).reverse());
	
}
	
	public static void main(String[] args) {
		
		reverse1("Jagrat Gupta"); // atpuG targaJ
		reverse2("Jagrat Gupta"); // atpuG targaJ
		reverseWithStrBuffer("Jagrat Gupta"); // atpuG targaJ
		reverseWithStrBuilder("Jagrat Gupta"); // atpuG targaJ
	}

}
