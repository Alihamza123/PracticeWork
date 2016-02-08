package practice.arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object array[][] = new Object[3][3];
		array[0][0] = "Ali";
		array[0][1] = "Hamza";
		array[0][2] = "Alhambra , CA";
		array[1][0] = "Bablu";
		array[1][1] = "Banik";
		array[1][2] = "Los Angeles , CA";
		array[2][0] = "Shahid";
		array[2][1] = "Islam";
		array[2][2] = "Los Angeles , CA";
		
		// PRINT ALL OBJECTS IN ARRAY
		int row = array.length;
		int col = array[0].length;
		
		for(int a = 0 ; a < row ; a ++)
			for(int b = 0 ; b < col ; b ++){
				System.out.println(array[a][b]);
			}
		// PRINT OBJECT IN 2ND INDEX
		System.out.println("OBJECT IN 2ND INDEX : " + array[0][1]);
	}
}
