package abstractinheritance;

 class Animal {

	 //create a method
	public void makeSound() {
		System.out.println("The Animal makes a sound");
	}
} 
    //Dog extends animal class
	class Dog extends Animal{
		@Override
		public void makeSound() {
			System.out.println("The dog sounds barks");
		}
	}
	
	//Cat class extends animal class
	class Cat extends Animal{
		@Override
		public void makeSound() {
			System.out.println("The cat sounds mews");
		}
	}
	

  public class Pets {
	  public static void main(String[] args) {
		  
		  //create objects of animal,dog and cat class
			Animal animal = new Animal();
			Dog dog = new Dog();
			Cat cat = new Cat();
			
			//dispaly the result
			animal.makeSound();
			dog.makeSound();
			cat.makeSound();
}
}
  
//-------------OUTPUT-----------------
//  The Animal makes a sound
//  The dog sounds barks
//  The cat sounds mews