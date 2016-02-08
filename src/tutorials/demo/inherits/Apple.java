package tutorials.demo.inherits;

public class Apple extends CellPhones {

	String phoneBrand = "Apple";
	String madeIn = "U.S.A";
	boolean moreProducts = true;
	int custRating = 10;
	
	void infoSamsung(){
		System.out.println("Phone Company : " + phoneBrand);
		System.out.println("Customer Rating: " + custRating);
		System.out.println("Does Samsung have more products besides Cell Phones? "+moreProducts);
		System.out.println("_________________________________________");

	}

}
