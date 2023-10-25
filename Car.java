package class_constructor;

public class Car {
   private String make;
   private String model;
   private Short year;
   private int price;
      
   // using parameterized constructor
   
 public Car(String make,String model,Short year,int price){
	  this.make=make;
	  this.model=model;
	  this.year=year;
	  this.price=price; 
	 }
 
   // using Getter method
 public String getMake() {
	 return make;
 }
 public String getModel() {
	return model;
 }
 public short getYear() {
	 return year;
 }
 public int getPrice() {
	 return price;
 }
 //method to display  about car details  
 public void display() {
	 System.out.println("Make: " + getMake());
	 System.out.println("Model: " + getModel());
	 System.out.println("Year: " + getYear());
	 System.out.println("Price: " + getPrice());
 }
 public static void main(String[] args) {
	 //create a object named as Car
	 Car c1=new Car("Mahindra","Xuv",(short)7,560000);
	 c1.display();
 }
 }

//-----------------OUTPUT----------------------
//Make: Mahindra
//Model: Xuv
//Year: 7
//Price: 560000 