package practice.min_max;

public class MinMax {

	public static void main(String[] args) {
		
		// FIND THE MINIMUM IN SERIES OF NUMBERS
		int numbers[]= {45,21,2,215,631,12,3};
		int min = numbers[0];
		int a ;
		for (a=0 ; a<numbers.length ; a ++)
		if (numbers[a]<min)
		min = numbers[a];
		System.out.println(" MINIMUM = " + min);
		
		// FIND THE MAXIMUM IN SERIES OF NUMBERS		
		int phone[] = {51,12,2,1211};
		int max = phone[0];
		int b ; 
		for(b = 0 ; b < phone.length ; b++)
			if(phone[b]>max)
				max = phone[b];
		System.out.println(max);
	}
}
