package practice.constructors;

public class Cars {
	
	String favoriteFood;
	String favoriteCar;
	
	public Cars(){
		
	}
	
	public Cars(String name, String job) {
		System.out.println("Name :" + name);
		System.out.println("Occupation :" + job);
	}

	public Cars(double pay, double bonus) {
		double totalPay = pay + bonus;
		System.out.println("Total Pay :" + totalPay);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Cars emp1NameJob = new Cars("Ali Hamza", "Qa Engineer");
		Cars emp1Salary = new Cars(80000, 12000);
		Cars emp1Food = new Cars();
		Cars emp1Car = new Cars();
		emp1Food.favoriteFood = "Chicken Biriyani";
		emp1Car.favoriteCar = "Nissan GTR";
		System.out.println("FAVORITE FOOD :"+emp1Food.favoriteFood);
		System.out.println("FAVORITE CAR :"+emp1Car.favoriteCar);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Cars emp2NameJob = new Cars("Bob" , "Chef");
		Cars emp2Salary = new Cars(34000, 2000);
		Cars emp2Food = new Cars();
		Cars emp2Car = new Cars();
		emp2Food.favoriteFood = "Burgers";
		emp2Car.favoriteCar = "Toyota Camry";
		System.out.println("FAVORITE FOOD :"+emp2Food.favoriteFood);
		System.out.println("FAVORITE CAR :"+emp2Car.favoriteCar);
	
	}
}
