package array;

import java.util.Scanner;
import java.util.Random;
public class ThreeDArray {
    
	//create an initialize array method
	public  static void initializeArray(int array[][][]) {
		Random random = new Random();
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				for(int k=0; k<array[i][j].length;k++) {
					array[i][j][k] = random.nextInt(100);
				}
			}
		}
	}
	
	//dispaly array using displayArray method
	public static void displayArray(int array[][][]) {
		
		for(int i=0; i<array.length; i++) 
		{
		    System.out.println("Levels "+i+" : " );
			for(int j=0; j<array[i].length;j++) {
				for(int k=0; k<array[i][j].length;k++) {
					System.out.print(array[i][j][k]+" ");		
		}
	}
			System.out.println();
  }
		  System.out.println();   
 }
	
     //create a maximumValue to find max value
    public static void maximumValue(int array[][][]) {
    	int max = array[0][0][0];
    	for(int i=0; i<array.length; i++) {
    		for(int j=0;j<array[i].length; j++) {
    			for(int k=0; k<array[i][j].length; k++) {
    				if(array[i][j][k]>max) {
    					max = array[i][j][k];
    				}
    			}
    		}
    	}
    	System.out.println("Maximum value: "+max);
    }
    
     //Create a averageArray method to find average of arrays
      public static double averageArray(int array[][][]) {
    	int sum = 0;
    	int count = 0;
    	for(int i=0; i<array.length; i++) {
    		for(int j=0; j<array[i].length; j++) {
    			for(int k=0; k<array[i][j].length; k++) {
    				sum+=array[i][j][k];
    				count++;
    			}
    		}
    	}
    	
    	if(count == 0 ) {
    		return count;
    	}
    	return (double) sum / count;
    }
    public static void main(String[] args) {
    	
    	//create a scanner class
    	Scanner sc =new Scanner(System.in);
    	
    	System.out.println("Enter the number of levels:");
    	int levels = sc.nextInt();
    	
    	System.out.println("Enter the number of rows:");
    	int rows = sc.nextInt();
    	
    	System.out.println("Enter the number of columns:");
    	int cols = sc.nextInt();
    	
    	int [][][] threeDArray = new int [levels][rows][cols];
    	System.out.println("Initializing 3D Array");
    	System.out.println();
    	
    	//methods called from class name
    	initializeArray(threeDArray);
    	
    	displayArray(threeDArray);
    	
    	maximumValue(threeDArray);
    	
    	//display the array
    	System.out.println("Average Array: "+averageArray(threeDArray));
    	}
}

//------------------------OUTPUT---------------------
//Enter the number of levels:
//3
//Enter the number of rows:
//4
//Enter the number of columns:
//4
//Initializing 3D Array
//
//Levels 0 : 
//73 27 53 32 56 9 27 25 8 67 73 91 92 93 18 44 
//Levels 1 : 
//5 57 21 9 54 72 41 1 0 41 84 22 28 89 67 24 
//Levels 2 : 
//83 17 74 68 5 51 77 58 65 48 58 33 93 35 58 29 
//
//Maximum value: 93
//Average Array: 46.979166666666664