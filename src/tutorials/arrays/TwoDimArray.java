package tutorials.arrays;

public class TwoDimArray {

	public static void main(String[] args) {

		// declare a 2 dimensional array with 3 rows and 2 columns
		int array[][] = new int[3][2];

		// add values to array
		array[0][0] = 10;
		array[0][1] = 15;
		array[1][0] = 90;
		array[1][1] = 54;
		array[2][0] = 9;
		array[2][1] = 25;

		// declare x as row length
		int a = array.length;
		// declare y as column length
		int b = array[0].length;

		// print all array values with for loop
		for (int c = 0; c < a; c++)
			for (int d = 0; d < b; d++) {
				System.out.println(array[c][d]);
			}

	}
}
