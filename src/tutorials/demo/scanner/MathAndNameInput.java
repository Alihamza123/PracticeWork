package tutorials.demo.scanner;

import java.util.Scanner;

public class MathAndNameInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner calc = new Scanner(System.in);

		System.out.println("Enter your first number = ");
		int num1 = calc.nextInt();
		System.out.println("Enter your second number = ");
		int num2 = calc.nextInt();
		int num3 = (num1 + num2);
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println("----------------------------------------------------------");

		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is greater than " + num1);
		} else if (num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		}
		System.out.println("----------------------------------------------------------");

		Scanner name = new Scanner(System.in);

		System.out.println("Enter your First Name = ");
		String fName = name.nextLine();
		System.out.println("Enter your Last Name = ");
		String lName = name.nextLine();
		System.out.println("How old are you ?");
		String age = name.nextLine();
		String info = ("Full Name : " + fName.toUpperCase() + " " + lName.toUpperCase() + "\n" + age);
		System.out.println("Your Information : " + "\n" + info);

	}
}
