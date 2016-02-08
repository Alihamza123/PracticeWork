package practice.inheritance;

public class InterfaceImplement implements InterfaceA {

	@Override
	public void goWalking() {
		System.out.println("LETS GO WALKING!!");
	}

	@Override
	public void letsCalculate() {
		int a = 1;
		int b = 2;
		int total = (a + b);
		System.out.println(total);
	}

	public static void main(String[] args) {
		InterfaceImplement obj = new InterfaceImplement();
		obj.goWalking();
		obj.letsCalculate();

	}
}
