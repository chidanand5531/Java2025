package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindTheMissingNumber {

	public static void main(String[] args) {

int arr[]= {2,5,6,9,9};

// Find the largest number
// add the all the given numbers into hash set
// check the heset contains the number (starting from 1 to largest)

Arrays.sort(arr);

Integer largest= arr[arr.length-1];

System.out.println(largest);

HashSet<Integer> hashSet = new HashSet<Integer>();
 for(Integer num:arr) {
	 hashSet.add(num);
 }
 System.out.println("Missing numbers are ");
 
 for (int i = 1; i <=largest; i++) {
	if (!hashSet.contains(i)) {
		System.out.print(i + " ");
	}
}
		
	}

}
