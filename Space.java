package constructor_class;

//Super class
class Vehicle{
	void Start() {
		System.out.println("Vehicle Started");
	}
}

//create sub class Car
class Car extends Vehicle{
	void Start() {
		System.out.println("Car Started");
	}
}

//create sub class Motorcycle
class Motorcycle extends Vehicle{
	void Start() {
		System.out.println("Motorcycle Started");
	}
}

//create class Garage
 class Garage{
	public void serviceVehicle(Vehicle vehicle) {
		vehicle.Start();
		System.out.println("Vehicle Serviced");
	}
}
 
public class Space {
     public static void main(String[] args) {
    	 
    	 //create instance of Car
    	 Car car = new Car();
    	 
    	 //create instance of Motorcycle
    	 Motorcycle motorcycle = new Motorcycle();
    	 
    	 //create instance of Garage
    	 Garage garage = new Garage();
    	 
    	 //call serviceVehicle() with  instance of Car
    	 System.out.println("Servicing the Car");
    	 garage.serviceVehicle(car);
    	 
    	 //call serviceVehicle() with  instance of Motorcycle
    	 System.out.println("Servicing the Motorcycle");
    	 garage.serviceVehicle(motorcycle);
     }
     }
    	 
//------------OUTPUT----------------
//Servicing the Car
//Car Started
//Vehicle Serviced
//
//Servicing the motorcycle
//Motorcycle Started
//Vehicle Serviced

