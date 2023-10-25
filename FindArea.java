package abstractinheritance;

abstract class Shape{
	abstract double calculatedArea();
}
	
	// Circle class extends Shape Class
	 class Circle extends Shape
	 {
        double rad;
        
        //Constructor of circle
        public Circle(double rad)
        {
        this.rad = rad;
	    }
     
		@Override
		double calculatedArea() 
		{
			return Math.PI * rad *rad;
		}
		 
	 }
	 
     //Rectangle Class extends Shape Class
	 
	     class Rectangle extends Shape{
		 double length;
		 double breadth;
		 
		 public Rectangle(double length, double breadth) {
			 this.length=length;
			 this.breadth=breadth;
		 }
		 @Override
		 double calculatedArea() {
			return length*breadth;
			 
		 }
	 }

	 
	 
	 public class FindArea{
		 public static void main(String args[]) {
			 
			 //create circle and rectangle object
			 Circle cir = new Circle(4);
			 Rectangle rec = new Rectangle(5,7);
				 
			 //print area of circle and rectangle
			 System.out.println("Area of Circle: " + cir.calculatedArea());
			 System.out.println("Area of Rectangle: " + rec.calculatedArea());
				 
			 }
		 }
	 
//----------- OUTPUT ---------------------------------------------------
//	 Area of Circle: 50.26548245743669
//	 Area of Rectangle: 35.0