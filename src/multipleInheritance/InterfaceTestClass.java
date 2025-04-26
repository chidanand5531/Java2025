package multipleInheritance;

public class InterfaceTestClass extends C1 implements I1, I2 {

	@Override
	public void m1() {
		System.out.println("implemented m1 method");

	}

	@Override
	public void m2() {
		System.out.println("implemented m2 method");

	}

	public static void main(String[] args) {

		InterfaceTestClass obj = new InterfaceTestClass();
		obj.m1(); //From interface 1
		obj.m2(); //From interface 1
		obj.m3(); //From Class C1
		
		// Inherting the methods and variables from two or more parents

	}

}
