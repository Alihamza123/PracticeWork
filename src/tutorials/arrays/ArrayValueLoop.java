package tutorials.arrays;

public class ArrayValueLoop {

	public static void main(String[] args) {

		int nums[] = new int[10];

		for (int x = 1; x < nums.length; x++) {
			nums[x] = x;
			System.out.println("Array value = " + nums[x]);
		}

	}

}
