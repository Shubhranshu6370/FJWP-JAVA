package methodoverloading;

 class Vehicle {
	String make;
	String model;
	int year;
    int maximumSpeed;

    //create a parameterized constructor
public Vehicle( String make ,String model ,int year ,int maximumSpeed) {
	this.make = make;
	this.model = model;
	this.year = year;
	this.maximumSpeed = maximumSpeed;
}

//Declare a  drive method 
public void drive() {
	System.out.println(make + " " + model + "is driving");
}
//create a display method 
	public void display() {
		System.out.println("Make: "+ make);
		System.out.println("Model: "+ model);
		System.out.println("Year: "+ year);
		System.out.println("Maximum Speed: "+ maximumSpeed);
		
	}
}

 //Car extends property from vehicle class
class Car extends Vehicle{
	public Car(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}
	//override drive() into car class
	@Override
	public void drive() {
		System.out.println(make + " " + model + "Car is driving");
	}
}

//Bike extends property from vehicle class
  class Bike extends Vehicle{
	  public Bike(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}
	  
	 //override drive() into bike class
	@Override
	public void drive() {
		  System.out.println(make + " "+ model + "Bike is driving");
		  
	  }
  
public class Frame{
	
public static void main(String[]args) {
	
	//create class car and bike
	Car car = new Car("Toyota","Camry",2021,160);
	Bike bike = new Bike("Hero","Glamour",2018,140);
	
	System.out.println("Car Deatails: ");
	car.display();
	System.out.println("\n Bike Details: ");
	bike.display();
	
	System.out.println("\n Calling drive method: ");
	car.drive();
	bike.drive();
	
	
}
}
  }

//------------------OUTPUT-----------------------
//Car Deatails: 
//  Make: Toyota
//  Model: Camry
//  Year: 2021
//  Maximum Speed: 160
//
//   Bike Details: 
//  Make: Hero
//  Model: Glamour
//  Year: 2018
//  Maximum Speed: 140
//
//   Calling drive method: 
//  Toyota CamryCar is driving
//  Hero GlamourBike is driving