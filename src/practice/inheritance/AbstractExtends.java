package practice.inheritance;

public class AbstractExtends extends AbstractA {

	@Override
	void calculateTotalPay() {
		double pay = 123000;
		double bonus = 5000;
		double totalPay = pay + bonus;
		System.out.println(totalPay);
	}

	@Override
	void displayInfo() {
		System.out.println("here is your INFO : ");
	}

	public static void main(String[] args) {

		AbstractExtends obj = new AbstractExtends();
		obj.printName("Ali Hamza");
		obj.calculateTotalPay();
		obj.displayInfo();
	}

}
