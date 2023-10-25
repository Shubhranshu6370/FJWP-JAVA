package class_constructor;

public class Employee {
	// All member variables declare as protected
 protected int id;
 protected int age;
 protected String name;
 protected boolean isPermanent;
  
 public static void main(String[] args) {
	 
	 //if int age=35.5 then it shows compilation error
	 double age=35.5;
	 //by explicit casting convert double to int
	 int age1=(int)age;
	 System.out.println(age1);
	 System.out.println("Successfully started");
	 
 }
}


//--------------OUTPUT-----------
//35
//Successfully started
//