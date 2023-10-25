package exceptionhandling;

import java.util.Scanner;
public class IntegerConvertHandle {

	public static void main(String[] args) {
		
		//Using try block to find exception
		try(Scanner sc =new Scanner(System.in)){
		
			System.out.println("Enter an integer value:");
			
			String input= sc.nextLine();
			
			//Using if statement
			if(input.isEmpty()) {
				System.out.println("Input is null");
			}
			
			//convert user input to integer
			 int number = Integer.parseInt(input);
			 System.out.println("Converted to integer: "+number);
		}
		//using catch block
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception: "+e.getMessage());
		}
        catch(NullPointerException e) {
        	System.out.println("Null Pointer Exception: "+e.getMessage());
        }
		//using finally block 
		finally {
			System.out.println(" It Executes always");
		}
	}

}

//------------------OUTPUT-------------------
//Enter an integer value:
//24
//Converted to integer: 24
// It Executes always