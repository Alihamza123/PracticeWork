package practice.inheritance;

public class Parent {

	String occupation = "Doctor";
	String location = "USA";
	String gender = "male";
	String food = "pizza";

	public void goToWork() {
		System.out.println(
				" Parent goes to Work at the Hospital. Parent works and brings home the income and provide for the family");
	}

	public void goDriving() {
		System.out.println(" Parent can drive a vehicle and has a Driver's License ");
	}

	public void favoriteFood() {
		System.out.println(" Parent's Favorite Food is : " + food);
	}

	public void parentInfo() {
		System.out.println(" Parent lives in : " + location);
		System.out.println(" Parent's gender is : " + gender);
	}

}

class Child extends Parent {

	String occupation = "Student";
	String location = "USA";
	String gender = "male";
	String food = "pizza";

	public void goToSchool() {
		System.out.println(" Child goes to School to get an education . Too young to get a job at this age ");
	}

	public void playGames() {
		System.out.println(" Child plays with videos games because he is still young ");
	}

	public void favoriteFood() {
		System.out.println(" Child's Favorite Food is : " + food);
	}

	public void childInfo() {
		System.out.println(" Child lives in : " + location);
		System.out.println(" Child's gender is : " + gender);
	}
}

class Test extends Child {

	public static void main(String[] args) {
		// Parent's unique qualities
		System.out.println(" PARENT'S UNIQUE QUALITES");
		Parent dad = new Parent();
		dad.goToWork();
		dad.goDriving();

		// Child's unique qualities
		System.out.println(" CHILD'S UNIQUE QUALITIES ");
		Child boy = new Child();
		boy.goToSchool();
		boy.playGames();

		// Parent and Child Common Qualities
		System.out.println(" PARENT AND CHILD COMMON QUALITIES");
		dad.favoriteFood();
		boy.favoriteFood();
		dad.parentInfo();
		boy.childInfo();

	}

}
