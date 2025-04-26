package test;

public class ShortestAndlongestWord {

	public static void main(String[] args) {


		//longest and shortest String in an array 

		String [] s = {"Hello","Hi","HelloWorld"};
		String largest = s[0];
		String shortest = s[0];
		

		for(String s1:s)
		{
			if(s1.length()>largest.length())
			{
				largest = s1; 
			}
			
			if(s1.length()<shortest.length())
			{
				shortest = s1;
			} 
		}
		System.out.println("largest word : " + largest);
		System.out.println("shortest word : " +shortest);
	}


}


