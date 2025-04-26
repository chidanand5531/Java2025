package test1;

import java.util.ArrayList;

public class Move1sAtbegining {

	public static void main(String[] args) {

		int arr[]={1,3,1,6,4,1,7,2};
		
		// 1,,1,1,1,3,6,4,7,2
		
		ArrayList<Integer> ones= new ArrayList<>();
		ArrayList<Integer> others= new ArrayList<>();
		
		for (int num : arr) {
			if(num==0) {
				ones.add(num);
			} else {
				others.add(num);
			}
		}
		
		ones.addAll(others);
		
		System.out.println(ones);
		
	}

}
