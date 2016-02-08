package tutorials.arrays;

public class ArrayTutorial1 {

	public static void main(String[] args) {

		// CREATING A NEW ARRAY WITH 3 VALUES
		int ar[] = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		
		// PRINT ONE ARRAY
		System.out.println("ar[0] : " + ar[0]);
		
		// PRINT THE LENGTH OF THE ARRAY
		System.out.println("Length of Array :" + ar.length);
		
		// PRINT ALL THE ARRAYS
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ALL THE ARRAYS : " + ar[i]);
		}
		
			System.out.println("......................................................................................................");
			
			
		// CREATING A NEW STRING ARRAY
			String sa[] = new String[11];
			sa[0] = "ali";
			sa[1] = "hassan";
			sa[2] = "mosul";
			sa[3] = " islam";
			sa[4] = "shahid";
			sa[5] = "masud";
			sa[6] = "rana";
			sa[7] = "ibrahim";
			sa[8] = "moshur";
			sa[9] = "mohammed";
			sa[10]="Bob";
			
			// PRINTING ALL THE NAMES IN THE ARRAY
			for (int a = 0; a < ar.length; a++) {
				System.out.println(sa[a]);
			}
			
			//SUM OF ARRAY AR[]
			int sum1 =0;
			for (int a = 0; a<ar.length;a++){
				sum1+=a;
			}System.out.println("SUM of ARRAY AR[ ] = "+sum1);
			
			
		}
	}

