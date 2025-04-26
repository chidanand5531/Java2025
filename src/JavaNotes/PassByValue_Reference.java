package JavaNotes;

public class PassByValue_Reference {
	
	/*Pass by Reference means sending the address of the memory location to a function
	If lecturer gives original notes to a student, if a student modifies it 
	then other students will not get the notes*/
	
	/*Pass by Value means methods and variables are copied into another memory location.
	If lecturer gives zerox copy notes to a student, if a student modifies it 
	then original notes will get afftected*/
	
	int data=50;

	public static void main(String[] args) {

		PassByValue_Reference op=new PassByValue_Reference();
		
		// Call by value - original values will not be affected
		System.out.println("Call by value before change : " +  op.data);
		op.changeData(500);
		System.out.println("Call by value after change : " +  op.data);
		
		// Call by reference - original values will get affected
		System.out.println("Call by reference before change : " +  op.data);
		op.changerefernce(op);
		System.out.println("Call by reference after change : " +  op.data);
		

	}
	
	// For call by value
	public  void changeData(int data){
		data=data+100;
	}
	
	
	// Call by reference
	public  void changerefernce(PassByValue_Reference op){
		op.data=op.data+100;
	}
	
	

}
