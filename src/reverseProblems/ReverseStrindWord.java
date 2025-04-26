package reverseProblems;

public class ReverseStrindWord {
	
	public static void reverseWord(String str) {
		
		String[] st=str.split(" "); // {"Test", "automation"}
		String rev="";
		
		for (int i =st.length-1; i>=0 ; i--) {
			rev=rev+st[i]+" ";
		}
		
		System.out.println("After swaping: " + rev.trim());
	}

	public static void main(String[] args) {
		reverseWord("Test Automation"); // Automation Test 

	}

}
