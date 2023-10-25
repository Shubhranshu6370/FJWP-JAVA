package scan;

import java.util.Scanner;

public class StudentMarks {
     public static void main(String[] args) {
    	 
    	 //create a scanner class object
    	 Scanner scan = new Scanner(System.in);
    	 
    	 System.out.println("Enter the marks for five subject");
    	 
    	 //initialise sum variable
    	 int sum=0;
    	 
    	 //using for loop
    	 for(int i=1;i<=5;i++) {
    		 int subject=scan.nextInt();
    		 System.out.println("Subject "+i+" = "+subject);
    		 sum+=subject;
    	 }
    	 
    	 System.out.println("Total marks: "+sum);
    	 
    	  double average=(int)sum/5;
    	  
    	  String grade;
    	  
    	  //using if and else-if statement
    	  if(average>90) {
    		  grade="EX";
    	  }
    	  
    	  else if(average>80) {
    		  grade="A";
    	  }
    	  
    	  else if(average>60) {
    		  grade="B";
    	  }
    	  
    	  else if(average>=40) {
    		  grade="C";
    	  }
    	  
    	  else {
    		 grade="F";
    	  }
    	 
    	  //Display the results
    	  System.out.println("Grade: " + grade);
    	  System.out.println("Average: " +average);
    	  scan.close();
     }
}

//--------------OUTPUT--------------------
//Enter the marks for five subject
//87
//Subject 1 = 87
//88
//Subject 2 = 88
//90
//Subject 3 = 90
//82
//Subject 4 = 82
//74
//Subject 5 = 74
//Total marks: 421
//Grade: A
//Average: 84.0 */

