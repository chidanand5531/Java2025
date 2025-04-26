package JavaRefresh;

interface Shape {
	
	int width=10;  // final and static in nature
	int length=20; // final and static in nature
	
	
	// default methods are allowed after Java 8
	default void square(){
		System.out.println("Default method from interface");
	}
	
	// static methods are allowed after Java 8
	static void cube() {
		System.out.println("static method from interface");
	}
	
	// Abstract method -- no implementation
	void rectangle();
 
	
}

public class InterfaceDemo implements Shape {
	


	private static int width2;


	@Override
	public void rectangle() {
		
		System.out.println("A method from interface and provided implementation");
		
	}
	

	public static void main(String[] args) {
		
		InterfaceDemo obj= new InterfaceDemo();
		obj.square();
		obj.rectangle();
		Shape.cube();   // to call a static method from interface -- interfacename.methodName();
	System.out.println(obj.width);
	System.out.println(obj.length);
	
	}

}
