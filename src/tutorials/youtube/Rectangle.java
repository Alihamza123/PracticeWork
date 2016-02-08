package tutorials.youtube;

import java.util.Scanner;

public class Rectangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int length, width;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Length");
		length = input.nextInt();
		System.out.println("Enter the width");
		width = input.nextInt();
		
		int area = recArea(length,width);
		int perimeter = recPeri(length,width);
		System.out.println(area);
		System.out.println(perimeter);
		
	}

	public static int recArea(int length, int width) {
		
		return length * width;
	}

	public static int recPeri(int length, int width) {

		return 2 * (length + width);
	}
}
