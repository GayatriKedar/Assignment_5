package assignment5;

class Shape{
	public void printAreaSquare(int a) {
		System.out.println("Area of square : "+a*a);
	}
	
	public void printAreaRectangle(int l,int b) {
		System.out.println("Area of rectangle : "+ l*b);
	}
	
	public void printPerimeterSquare(int a) {
		System.out.println("Perimeter of square : "+4*a*a*a*a);
	}
	
	public void printPerimeteRectangle(int l,int w) {
		System.out.println("Perimeter of rectangle : "+2*(l+w));
	}
}


public class TestShape {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.printAreaSquare(5);
		shape.printPerimeterSquare(4);
		shape.printAreaRectangle(4, 5);
		shape.printPerimeteRectangle(5, 4);

	}

}
