package flowparameter;

import java.util.Scanner;
public class InfoArms{
	
    //method to calculate cube of number
	public static int calculateCube(int num) {
		int cube=0;
	//using while loop 
		while(num>0) {
			int digit = num%10;
			cube +=(digit * digit * digit);
			num /=10;
		}
		return cube;
	}
	//method to print Armstrong number
  public static void printArmstrongNumber(int start,int end) {
    	for(int i=start;i<=end;i++) {
    		int cube = calculateCube(i);
    		if(cube == i) {
    			System.out.println(i);
    		}
        }
    }

public static void main(String[] args) {
	
	//create a scanner class
    Scanner sc = new Scanner(System.in);
    
    //Take start number from user
    System.out.println("Enter the number from start");
    
    int start = sc.nextInt();
    
    //Take end number from user
    System.out.println("Enter the number from end");
    
    int end = sc.nextInt();
    
    //print arm strong number between start and end
    System.out.println("Armstrong number between " + start + " and " + end + " : ");
     
    printArmstrongNumber(start,end);
    
    sc.close();
}
}
 
//----------------OUTPUT-----------------
//Enter the number from start
//10
//Enter the number from end
//1000
//Armstrong number between 10 and 1000 : 
//153
//370
//371
//407
