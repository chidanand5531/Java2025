package test;

public class Swap2Numbers {

	public static void main(String[] args) {

	int a=10; int b=20;
	
	// Logic1 with temporary variable
	
	/*int temp=a;
	a=b;
	b=temp;
	System.out.println("After swaping the Number with temporary varibale : "+"a="+a+" "+"b="+b);*/
	
	// Logic2 without temporary variable
	
	a=a+b; // 10+20=30
    b=a-b; // 30-20=10
    a=a-b; // 30-10=20
    
	System.out.println("After swaping the Number without temporary varibale  : "+"a="+a+" "+"b="+b);
	
	// Logic3 without using temporary variable
	
	a=a*b;  // 10*20=200
	b=a/b;  // 200/20=10
	a=a/b;  // 200/10=20
	System.out.println("After swaping the Number without temporary varibale  : "+"a="+a+" "+"b="+b);
	
	}
}