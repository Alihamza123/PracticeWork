package tutorials.demo.employee;

public class EmployeeClass {

	String name, location, occupation, gender;
	int pay, bonus, totalSalary;
	long social;
	String info;

	public int calculatePay(int p, int b) {
		pay = p;
		bonus = b;
		totalSalary = (p + b);
		return totalSalary;

	}

	public void setInfo(String n, String l, String o, String g) {
		name = n;
		location = l;
		occupation = o;
		gender = g;
		info = (n + l + o + g);

	}

	protected void viewInfo() {
		System.out.println("Name : " + name);
		System.out.println("Location : " + location);
		System.out.println("Gender : " + gender);
		System.out.println("Occupation : " + occupation);
		System.out.println("Salary : " + totalSalary);
		System.out.println("---------------------------------------------");
	}

	public static void main(String[] args) {

		EmployeeClass emp1 = new EmployeeClass();
		emp1.setInfo("Ali Hamza", "California, USA", "Automation Test Engineer", "Male");
		emp1.calculatePay(84000, 13000);

		EmployeeClass emp2 = new EmployeeClass();
		emp2.setInfo("Hannah", "Beirut, Lebanon", "Pre-School Teacher", "Female");
		emp2.calculatePay(45000, 11000);

		EmployeeClass emp3 = new EmployeeClass();
		emp3.setInfo("Ibrahim", "Colombo, Sri Lanka", "Cashier", "Male");
		emp3.calculatePay(67000, 3400);

		EmployeeClass emp4 = new EmployeeClass();
		emp4.setInfo("Fathima", "Colombo, Sri Lanka", "Pre-School Teacher", "Female");
		emp4.calculatePay(33000, 5600);

		emp1.viewInfo();
		emp2.viewInfo();
		emp3.viewInfo();
		emp4.viewInfo();

	}

}
