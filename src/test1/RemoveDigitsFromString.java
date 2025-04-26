package test1;

public class RemoveDigitsFromString {
	
	public static void removeDigit1(String str) {
		//System.out.println("After removing: "+ str.replaceAll("\\d", ""));
		System.out.println("After removing: "+ str.replaceAll("[^A-Za-z]", ""));
	}
	
	public static void removeDigit(String str) {
		String req="";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				req=req+ch[i];
			}
		}
		
		System.out.println("After removing: "+ req);
	}

	public static void main(String[] args) {
		removeDigit("Test2028 Automation208"); // Test Automation
		removeDigit1("Test2028 Automation208"); // Test Automation

	}

}
