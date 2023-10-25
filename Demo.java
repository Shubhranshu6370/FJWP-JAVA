package class_constructor;

//Decalre Animal as a super class 
 class Animal {
	   public void makeSound() {
		   System.out.println("The animal make a sound");  
		   }
	}
  //using extend keyword to inherite property from parent class
	class Dog extends Animal {
		public void makeSound() {
			System.out.println(" Dog sounds barks");
		}
	}

	class Cat extends Animal{
	    public void makeSound() {
	    	System.out.println(" Cat sounds meows");
	    }
	}
 //create a  another class called Demo 
	  public class Demo {
		public static void main(String[] args) {
			//create a object named as Animal
			Animal a=new Animal();
			Dog d1=new Dog();
			Cat c1=new Cat();
			
			a.makeSound();
			d1.makeSound();
			c1.makeSound();
		}
	}

//----------------OUTPUT--------------
// The animal make a sound
// Dog sounds barks
// Cat sounds meows 
// 

