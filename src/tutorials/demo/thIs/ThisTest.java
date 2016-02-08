package tutorials.demo.thIs;

public class ThisTest {

	int number = 1;

	public static void main(String[] args) {
		ThisTest x = new ThisTest();
		x.method1(30);
		x.method2();

	}

	void method1(int number) {
		number = 10;

		System.out.println(this.number);
		System.out.println(number);
		System.out.println("---------------------");

	}

	void method2() {
		number = 20;
		System.out.println(this.number);
		System.out.println(number);
		System.out.println("---------------------");

	}
}
