package tutorials.variables;

public class LocalVariable {
	/*
	 * Below variables are LOCAL VARIABLES as it is defined inside method in
	 * class. Only modifier that can be applied on local variable is FINAL. To
	 * know more about access and non access modifier visit appropriate section.
	 *
	 * Note* : Local variable needs to initialize before they can be used. Which
	 * is not true for Static or Instance variable.
	 */

	public static void method1() {
		final String s = "Hello World";
		String b = "Bye World";
		System.out.println(s);
		System.out.println(b);
		System.out.println("_______________________________");

	}

	public static void method2() {
		final String a = "Whats your name?";
		final String b = "Ali Hamza";
		System.out.println(a);
		System.out.println(b);
		System.out.println("_______________________________");

	}

	public static void main(String[] args) {
		// LETS CALL THE METHODS WITH THE LOCAL VARIABLES INSIDE IT
		method1();
		method2();

		// YOU CAN CALL IT FROM THE CLASS NAME AS WELL
		LocalVariable.method1();
		LocalVariable.method2();
		
		

	}

}
/*
 * Rules for Instance variable:
 * 
 * Can use any of the four access level
 * Can be marked final
 * Can be marked transient 
 * Can not be marked abstract 
 * Can not be marked synchronized 
 * Can not be marked strict
 * Can not be marked native 
 * Can not be marked static
 */
