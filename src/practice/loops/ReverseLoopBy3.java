package practice.loops;

public class ReverseLoopBy3 {

	public static void main(String[] args) {
			
		for (int i = 48 ; i>0 ; i=(i-3)){
			System.out.println(i);
			if (i==27){
				continue;
			}
		}
	}

}
