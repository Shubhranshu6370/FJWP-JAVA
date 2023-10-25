package array;

import java.util.Scanner;
public class ArraySum {
  public static void main(String[]args) {
	  //using scanner class to take user input
	  Scanner sc =new Scanner(System.in);
	  
	  //declare  the array size 
	  int arr[] = new int[10];
	  
	  System.out.println("Enter 10 elements");
	  
	  //using for loop
	  for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextInt();	  
		  }
	  
	 int sum =0;
	 for(int i=0;i<arr.length;i++) {
		 sum+=arr[i];
	 }
	 
	 //calculate average of elements
	 int i=1;
	double average = sum/arr[i];
	System.out.println("The sum of elements: "+ sum);
	System.out.println("The avegare of elements: " + average);
	System.out.println(arr[i]);
  }
}

/*OUTPUT:-
Enter 10 elements
11
22
33
44
55
66
77
88
99
111
The sum of elements: 606
The avegare of elements: 55.0 */