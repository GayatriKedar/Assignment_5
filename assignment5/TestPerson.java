package assignment5;

class Person {
	public void displayInfo() {
		System.out.println("This is a person.");
	}
}

class Employee extends Person {
	public void work() {
		System.out.println("I am working.");
	}

	public double getSalary() {
		return 50000;
	}

	@Override
	public void displayInfo() {
		System.out.println("This is an employee.");
	}
}

class HRManager extends Employee {
	@Override
	public void work() {
		System.out.println("I manage the HR department.");
	}

	public void addEmployee() {
		System.out.println("Adding a new employee.");
	}

	@Override
	public void displayInfo() {
		System.out.println("This is an HR Manager.");
	}
}

public class TestPerson {

	public static void main(String[] args) {

		Person person = new Person();
		person.displayInfo();

		Employee employee = new Employee();
		employee.displayInfo();
		employee.work();
		System.out.println("Employee Salary: " + employee.getSalary());

		HRManager hrManager = new HRManager();
		hrManager.displayInfo();
		hrManager.work();
		hrManager.addEmployee();

	}

}
