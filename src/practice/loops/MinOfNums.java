 package practice.loops;

public class MinOfNums {

		public static void main(String[] args) {
			int x[]= {10,79,67,49,100,60,5};
			int Min = x[0];
			int i;
			for (i=1; i<x.length; i++)
			if (x[i]<Min)
			Min = x[i];
			System.out.println("Minimum Number is :" + Min);
		}
	}
