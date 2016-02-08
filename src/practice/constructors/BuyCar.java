package practice.constructors;

public class BuyCar{
	
	 String make;
	 String model;
	 int price;
	
	public BuyCar(String make, String model, int price){
		this.make = make;
		this.model = model;
		this.price = price;
	}
	public void carinfo(){
		System.out.println(" Make = " + make);
		System.out.println(" Model = "+ model);
		System.out.println(" Price = "+ price);
	}
	
	public static void main(String[] args) {
		
		// Create new object using constructor
		BuyCar car1 = new BuyCar("Toyota" , "Camry" , 25000);
		// Call the Car Info method
		car1.carinfo();

	}

}
