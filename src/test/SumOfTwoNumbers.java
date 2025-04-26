package test;

public class SumOfTwoNumbers {
	

	//	It iterates through each pair of numbers in the array using two nested loops.
	//	It checks if the sum of each pair equals the target sum (which is 8 in this case).

	//	If it finds such a pair, it prints the indices of the two numbers and returns from the function.

	//	If no such pair is found, it prints a message indicating that no two numbers add up to the target sum.
	
	public static void main(String[] args) {
		
        int[] a = {2, 4, 4, 6, 7, 9, 8 };
        int targetSum = 8;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
            	
                if (a[i] + a[j] == targetSum) {
                    System.out.println("Indices: " + i + "," + j);
                    System.out.println("values are : " + a[i] + "," + a[j]);

                }
            }
        }

        
    }

}
