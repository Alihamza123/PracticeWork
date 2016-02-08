package practice.string;

public class SubString {
	
	public static void main(String[] args) {
		String name = "AliHamza";
		// Print just the 2nd character
		System.out.println(name.substring(1, 2));

		// Print from 3rd character to end
		System.out.println(name.substring(2));

		// Print from 1st character to 3rd
		System.out.println(name.substring(0, 3));

	}
}
