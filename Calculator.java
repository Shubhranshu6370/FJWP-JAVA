package class_constructor;

public class Calculator {
    //method to add two integers
	public int add(int a, int b) {
		return  a+b;
	}
	//method to add three integers
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	//method to add two doubles
	public double add(double a ,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		//create a calculator object
		Calculator cal = new Calculator();
		int r1 = cal.add(12, 13);
		
		System.out.println("sum of two numbers: " +r1);
		
		int r2 = cal.add(12, 13,14);
		
		System.out.println("sum of three numbers: " +r2);
		
		double r3 = cal.add(12.5, 13.5);
		
		System.out.println("sum of two double number: " +r3);
		
	}
}

//--------------OUTPUT-------------------
// sum of two numbers: 25
//sum of three numbers: 39
//sum of two double number: 26.0 
//
