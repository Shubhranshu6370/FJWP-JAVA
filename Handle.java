package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handle {

	public static void main(String[] args) {
		
		//using try block
		try(Scanner sc = new Scanner(System.in);)
		{
		 //Take input from user
		 System.out.println("Enter an integer:");
		  int number = sc.nextInt();
		  System.out.println("User entered: "+number);
		}
		 //using catch block 
		  catch(InputMismatchException e)
		  {
			  System.out.println("Invalid input. entered a valid integer");
		  }
		 //using finally block
		  finally {
			System.out.println("It executes always");
		  }
		}

	}

//-----------OUTPUT----------------------
//Enter an integer:
//34
//User entered: 34
//It executes always
