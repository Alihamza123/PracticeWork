package tutorials.demo.inherits;

public class Samsung extends CellPhones {
	
	String phoneBrand = "Samsung";
	String madeIn = "Korea";
	boolean moreProducts = true;
	int custRating = 8;

	void infoSamsung(){
		System.out.println("Phone Company : " + phoneBrand);
		System.out.println("Customer Rating: " + custRating);
		System.out.println("Does Samsung have more products besides Cell Phones? "+moreProducts);
		System.out.println("_________________________________________");

	}

}

