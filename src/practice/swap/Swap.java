package practice.swap;

public class Swap {

	int a = 10;
	int b = 20;
	int c = 30;
	public static void main(String[] args) {
		
		Swap test = new Swap();

		test.a = 10;
		test.b = 20;
		test.c = 30;
		
		test.a = test.b ;
		test.b = test.c ; 
		
		
		System.out.println(test.a);
		System.out.println(test.c);
	
		
	}
}
