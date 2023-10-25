package scan;

import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		
		//create a scanner class to take user input
		Scanner sc = new Scanner(System.in);
		
		//Take input principal amount , time and rate
		System.out.println("Enter the principal amount");
		int principal = sc.nextInt();
		
		System.out.println("Enter the time in years");
		double time = sc.nextDouble();
		
		System.out.println("Enter the rate");
		double rate =sc.nextDouble();
		
		//Modify the interest rate based on principal amount
		if(principal>10000) {
			System.out.println("interest rate is 10%");
		}
		
		else if(principal>=5000) {
			System.out.println("interest rate is 8%");
		}
		
		else {
			System.out.println("interest rate is 5%");
		}
		
		//calculate simpleInterest
		double simpleInterest = (principal*time*rate)/100;
		
		//Dispaly the simpleInterest
		System.out.println("Simple Interest: " + simpleInterest);
		
		//close the scanner
		sc.close();
       
	}

}


//------------------OUTPUT-------------------
// Enter the principal amount
//30000
//Enter the time in years
//5
//Enter the rate
//12
//interest rate is 10%
//Simple Interest: 18000.0 