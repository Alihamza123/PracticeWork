package practice.loops;

public class SumOfNums {

		public static void main(String[] args) {

			// CREATE AN ARRAY AND TOTAL THE SUM
			int[] array = { 2, 10, 1, 40 };
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}

			System.out.println("the sum is : " + sum);
		}
	}
