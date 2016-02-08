package tutorials.variables;

public class StaticVariable {

	static int a;
	static String b;
	static double c;

	/*
	 * THESE ARE STATIC VARIABLE AND IT IS OUTSIDE THE METHOD IT HAS STATIC
	 * MODIFIER TO IT.
	 */

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		/*STATIC VARIABLES CAN BE ACCESSED IN 2 WAYS:
		 * VIA OBJECT OF THE CLASS
		 * VIA CLASS NAME 
		 */
		
		StaticVariable obj = new StaticVariable();
		// THIS IS VIA OBJECT OF THE CLASS
		System.out.println(obj.a = 12);
		
		// THIS IS VIA CLASS NAME
		System.out.println(StaticVariable.b="Hello World");
	}

}
