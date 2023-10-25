package flowparameter;

import java.util.Scanner;

public class GrossEmployee{
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int choose=0;
	    while(choose!= -1) {
	    	//enter the basic salary of employee
	    	System.out.println("Enter the basic salary of employee");
	    	double basicSalary = sc.nextDouble();
	    	
	    	double grossSalary =  calculateSalary(basicSalary);
	    	System.out.println("Gross Salary: " +grossSalary);
	    	
	    	System.out.println("Enter -1 to exit");
	    	choose = sc.nextInt();	    	
	    	    }
	     sc.close();
	    	  }
	
		//method to calculate gross salary
		 public static double calculateSalary(double basicSalary) {
			double da;
			double hra;
			
			//using if-else statement
			if(basicSalary>15000) {
				hra=(basicSalary*0.2);
				da=(basicSalary*0.6);
			}
			
			else {
				hra=3000;
				da=(basicSalary*0.7);
			}
			double grossSalary = basicSalary + hra + da;
			return grossSalary;
			
		}
	}

//------------------OUTPUT---------------------
//Enter the basic salary of employee
//40000
//Gross Salary: 72000.0
//Enter -1 to exit
