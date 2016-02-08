package practice.functions;

public class PrimeCheck {
	
	 public boolean isPrimeNumber(int number){    
	        for(int i=2; i<=number/2; i++){
	        	if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String a[]){
	        PrimeCheck pc = new PrimeCheck();
	        System.out.println("Is 17 prime number? "+pc.isPrimeNumber(17));
	        System.out.println("Is 19 prime number? "+pc.isPrimeNumber(19));
	        System.out.println("Is 15 prime number? "+pc.isPrimeNumber(15));
	   	 }


}
