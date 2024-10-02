package assignment5;

class Degree {
	public void getDegree() {
		System.out.println("I got a degree.");
	}
}

class Undergraduate extends Degree {
	@Override
	public void getDegree() {
		System.out.println("I am an Undergraduate.");
	}
}

class Postgraduate extends Degree {
	@Override
	public void getDegree() {
		System.out.println("I am a Postgraduate.");
	}
}

public class TestDegree {

	public static void main(String[] args) {
		Degree degree = new Degree();
		degree.getDegree();
		Undergraduate undergrad = new Undergraduate();
		undergrad.getDegree();
		Postgraduate postgrad = new Postgraduate();
		postgrad.getDegree();
	}

}
