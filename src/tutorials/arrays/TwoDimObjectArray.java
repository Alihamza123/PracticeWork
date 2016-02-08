package tutorials.arrays;

public class TwoDimObjectArray {

	public static void main(String[] args) {

		// declare 2 DIM ARRAY AS AN OBJECT
		Object students[][];

		// ADD ROWS AND COLUMNS
		students = new Object[3][2];

		// ADD VALUES TO ARRAY
		students[0][0] = "Ali Hamza";
		students[0][1] = 1234;
		students[1][0] = "Hassan";
		students[2][0] = "Morshul";
		students[2][1] = 7845;

		// declare X FOR ROW LENGTH
		int x = students.length;

		// declare Y FOR COLUMN LENGTH
		int y = students[0].length;

		// PRINT ALL ARRAY WITH FOR LOOP
		for (int a = 0; a < x; a++)
			for (int b = 0; b < y; b++) {
				System.out.println(students[a][b]);
			}

	}
}
