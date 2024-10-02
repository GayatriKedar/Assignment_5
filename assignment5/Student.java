package assignment5;

public class Student {

	private String name;
	private int age;
	private String address;

	public Student() {
		name = "Unknown";
		age = 0;
		address = "Not Available";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}

		students[0].setInfo("Gayatri", 23, "Nashik");
		students[1].setInfo("Ashutosh", 26, "Manchar");
		students[2].setInfo("Akshada ", 21);
		students[3].setInfo("Adi", 22, "Pune");
		students[4].setInfo("Aditya", 23);
		students[5].setInfo("Rushi", 24, "Mumbai");
		students[6].setInfo("Harshada", 25);
		students[7].setInfo("Harshad", 24, "Satara");
		students[8].setInfo("Neha", 23);
		students[9].setInfo("Aditi", 22, "karad");

		for (Student student : students) {
			student.displayInfo();
		}
	}
	
}
