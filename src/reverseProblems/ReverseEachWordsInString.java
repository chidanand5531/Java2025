package reverseProblems;

public class ReverseEachWordsInString {

	public static void reveseword(String str) {

	String[] st= str.split(" ");
	StringBuffer sb=new StringBuffer();
	for(int i=0; i<st.length; i++) {
		sb.append(new StringBuffer(st[i]).reverse()+" ");
	}
	
	System.out.println("After revesring each word: "+sb.toString());
	}
	
	
	public static void main(String[] args) {
		reveseword("Test Automation"); // tseT noitamotuA 

	}

}
