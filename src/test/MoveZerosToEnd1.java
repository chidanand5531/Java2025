package test;

import java.util.Arrays;
import java.util.Iterator;

public class MoveZerosToEnd1 {

	public static void main(String[] args) {
		
		int num[]= {1,0,5,0,0,4,6,1};
		
		
		// Initiaze a variable with position 0
		// Traverse over array and asign      
        int position=0;								
													//  int position=3;
		for (int i = 0; i < num.length; i++) {    
			
			if (num[i]!=0) {
				num[position]=num[i];            
				position++;															
			}
		}
		//  {1,0,5,0,0,4,1}  
		// {1,5,5,0,0,4,6,1}
		// {1,5,4,0,6,1}
		// {1,5,4,6,6,1}
	
	 for (int i = position; i < num.length; i++) {
		 num[i]=0;
	}


	 System.out.print(Arrays.toString(num));

	}

public static void moveZerosToEnd(int num[]) {
		
		int position=0;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i]!=0) {
				num[position]=num[i];
				position++;
			}
		}
		
		for (int i = position; i < num.length; i++) {
			num[i]=0;
		}
		
		
	}

}
