package edu.gyansetu.tcs.oops.p2;

public class TestCircle {
	public static void main(String[] args) {

		Circle circle11 = new Circle(23.33);

		System.out.println(circle11);

		Shape shape1 = new Circle(234.44, "black", false);

		// System.out.println(shape1);

		displayDetails(shape1);

		Shape shape2 = new Rectangle("green", true, 10.8, 8.10);

		// System.out.println(shape2);

		displayDetails(shape2);

	}

	public static void displayDetails(Shape shape) {
		System.out.println("area is "+shape.getColor());
		
		if(shape instanceof Circle) {
			Circle circle1= (Circle) shape;			
			System.out.println(circle1.getArea());
		}
		else {
			System.out.println("wrong obj");
		}
		
		
	}

}