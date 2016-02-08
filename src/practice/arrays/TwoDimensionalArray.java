package practice.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count[][] = new int[3][2];
		count[0][0] = 123;
		count[0][1] = 100;
		count[1][0] = 1;
		count[1][1] = 124;
		count[2][0] = 4;
		count[2][1] = 777;

		int row = count.length;
		int col = count[0].length;
		for (int a = 0; a < row; a++)
			for (int b = 0; b < col; b++) {
				System.out.println(count[a][b]);
			}
	}

}
