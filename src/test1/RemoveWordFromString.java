package test1;

public class RemoveWordFromString {
	
	public static void removeword(String str, String word) {
		
		String st=str.replaceAll(word, "").trim();
		System.out.println("Afer removing : " + st);
	}
	
public static void removeword1(String str, String word) {
		
		String req="";
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(!split[i].equals(word)) {
				req=req+split[i]+" ";
			}
		}
		System.out.println("After removing : "+ req.trim());
	}

	public static void main(String[] args) {

		removeword("automation test engg test", "test"); // automation  engg
		removeword1("automation test engg test", "test"); // automation  engg

	}

}
