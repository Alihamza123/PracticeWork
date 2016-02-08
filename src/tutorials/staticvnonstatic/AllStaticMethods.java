package tutorials.staticvnonstatic;

public class AllStaticMethods {


	public static void main(String[] args) {
		
		
		AllStaticMethods.totalCal(5, 5);
		AllStaticMethods.printName("Ali", "Hamza");
		

	}

	public static void totalCal(int a,int b) {
		int num1 = a;
		int num2 = b;
		int total = (num1+num2);
		System.out.println(total);

	}

	public static void printName(String a, String b) {
		String first = a;
		String last = b;
		System.out.println(first + last);

	}


}
