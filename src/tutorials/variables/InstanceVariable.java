package tutorials.variables;

public class InstanceVariable {

	// EXAMPLE OF INSTANCE VARIABLE
	int variable1;
	String variable2;
	double variable3;

	public static void main(String[] args) {
		
		/*
		 * THEY CAN ONLY BE ACCESSED OUTSIDE ANY METHODS AND THEY ARE NOT USING
		 * STATIC. TO ACCESS THEM YOU HAVE TO CREATE AN OBJECT FROM ITS CLASS
		 */
		
		InstanceVariable obj = new InstanceVariable();
		// Here i can create a new object and print them out 
		System.out.println(obj.variable1 = 25);
		System.out.println(obj.variable2 = "Hello World");
		System.out.println(obj.variable3 = 67.124);
		
	}
}
