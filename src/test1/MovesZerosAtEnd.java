package test1;

import java.util.ArrayList;

public class MovesZerosAtEnd {

	public static void main(String[] args) {
		
		int arr[]= {2,0,3,0,9,0,1,9};
		// 2,3,9,1,9 0 0 0
		
		ArrayList<Integer> zeros = new ArrayList<>();
		ArrayList<Integer> Others = new ArrayList<>();
		
		for(Integer num:arr) {
			if(num==0) {
				zeros.add(num);
			}else {
				Others.add(num);
			}
		}
		
		Others.addAll(zeros);
		
		System.out.println(Others);
	}

}
