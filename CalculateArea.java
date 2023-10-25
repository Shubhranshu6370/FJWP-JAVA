package methodoverloading;

class Shape {
	//create a getArea method 
	public double getArea() {
		System.out.println("Finding the shape area");
		return 0;
	}
}
//Circle class extends property of shape class
class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	//override the getArea() into circle class
	@Override
	public double getArea() {
		return Math.PI * radius *radius;
	}
}
class Square extends Shape{
	private int length;
	public Square(int length) {
		this.length = length;
	}
	//override the getArea() into square class
	@Override
	public double getArea() {
		return length * length;	
	}
}
class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	//constructor for rectangle
	public Rectangle(int length , int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	//override the getArea() into rectangle class
	@Override 
	public double getArea() {
		return length * breadth;
		
	}

public class CalculateArea{
	public static void main(String[] args) {
	//create object for each class	
	Circle circle = new Circle(6);	
	Square square = new Square(4);
	Rectangle rectangle = new Rectangle(8,6);
	
	//print and calculate area 
	System.out.println("Area of Circle: "+circle.getArea());
	System.out.println("Area of Square: "+square.getArea());
	System.out.println("Area of Rectangle: "+rectangle.getArea());
	}

}
}

//------------------------OUTPUT---------------------
//Area of Circle: 113.09733552923255
//Area of Square: 16.0
//Area of Rectangle: 48.0
