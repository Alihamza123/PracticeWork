package practice.functions;

public class Function {

	public int addition(int num_1, int num_2) {
		int total = num_1 + num_2;
		return total;
	}

	public int multiply(int num_1, int num_2) {
		int total = num_1 * num_2;
		return total;
	}

	public static void main(String[] args) {

		Function math1 = new Function();
		math1.addition(10, 20);

	}
}
