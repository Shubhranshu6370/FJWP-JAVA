package exceptionhandling;

import java.util.Scanner;
public class Excepthand {
	
	//create methods like add,sub,mul and div
	public static int add(int a , int b) {
		return a + b;
	}
	public static int sub(int a , int b) {
		return a - b;
	}
	public static double mul(int a, int b) {
		return a * b;
	}
	public  static double div(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
				
		 double  result = 0;
		 
		 //using try block
		 try(Scanner sc = new Scanner(System.in))
		 {
 
		//take input from user
		 System.out.println("Enter the first number: ");
    	  int a = sc.nextInt();
			 
		 System.out.println("Enter the second number: ");
		  int b = sc.nextInt();

		 System.out.println("Enter operation:(+,-,*,/)");
		  char operator = sc.next().charAt(0);
		  
		//using switch operator
		 switch(operator) {
		 case '+':
			 result = add(a, b);
			 break;	 
		 case '-':
			 result = sub(a, b);
			 break;
		 case '*':
			 result = mul(a, b);
			 break;
		 case '/':
			 result = div(a, b);
			 break;
		 default:
			 System.out.println("Invalid number: ");
			 }
		 
		 System.out.println("Result: "+result);
		 }
		 //using catch block for exeptionhandle
		 
		 catch(ArithmeticException e) {
			 System.out.println(e.getMessage());
		 }
		 
		 catch(IllegalArgumentException e) {
			 System.out.println(e.getMessage());
		 }
		 
		 //using finally block
		 finally {
			 System.out.println("It executes always");
		 }
	  }
	}

//-------------------OUTPUT---------------
//Enter the first number: 
//10
//Enter the second number: 
//2
//Enter operation:(+,-,*,/)
//*
//Result: 20.0
//It executes always

