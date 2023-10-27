package mappingInterfaces;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
      public static void main(String []args) {
    	  
    	  //By using tree mapping
    	  TreeMap<String , String> tmap = new TreeMap<>();
    	  
    	  //using scanner class to take input
    	  Scanner sc = new Scanner(System.in);
    	  
    	  //using while loop
    	  while (true) {
    		  
              System.out.println("Dictionary Application Menu:");
              System.out.println("1. Add word-definition pair");
              System.out.println("2. Retrieve definition by word");
              System.out.println("3. Display all word-definition pairs");
              System.out.println("4. Exit");
              System.out.print("Enter your choice: ");
              
           //Take a choice variable
              int choice = sc.nextInt();
              sc.nextLine(); 
              
        //using switch case
              switch (choice) {
                  case 1:
                      System.out.print("Enter a word: ");
                      String word = sc.nextLine();
                      System.out.print("Enter its definition: ");
                      String definition = sc.nextLine();
                      tmap.put(word, definition);
                      System.out.println("Word-definition pair added successfully.");
                      break;
                      
                  case 2:
                      System.out.print("Enter a word to retrieve its definition: ");
                      String wordToRetrieve = sc.nextLine();
                      String retrievedDefinition = tmap.get(wordToRetrieve);
                      
                      //Using if-else statement to check the retrieve definition is null or not
                      if (retrievedDefinition != null) {
                          System.out.println("Definition: " + retrievedDefinition);
                      } 
                      
                      else {
                          System.out.println("Word not found in the dictionary.");
                      }
                      break;
                      
                  case 3:
                      System.out.println("All word-definition pairs in alphabetical order:");
                      
                      //using enhanced for loop
                      for (String key : tmap.keySet()) {
                          System.out.println(key + " - " + tmap.get(key));
                      }
                      break;
                      
                  case 4:
                      System.out.println("Exiting the dictionary application.");
                      System.exit(0);
                      break;
                      
                  default:
                      System.out.println("Invalid choice. Please try again.");

    	  }
    	}
    }
}

//---------------------------OUTPUT-------------------------
//Dictionary Application Menu:
//1. Add word-definition pair
//2. Retrieve definition by word
//3. Display all word-definition pairs
//4. Exit
//Enter your choice: 1
//Enter a word: Hello
//Enter its definition: To greet someone
//Word-definition pair added successfully.
//Dictionary Application Menu:
//1. Add word-definition pair
//2. Retrieve definition by word
//3. Display all word-definition pairs
//4. Exit
//Enter your choice: 1
//Enter a word: Welcome
//Enter its definition: To greet someone polite way
//Word-definition pair added successfully.
//Dictionary Application Menu:
//1. Add word-definition pair
//2. Retrieve definition by word
//3. Display all word-definition pairs
//4. Exit
//Enter your choice: 2
//Enter a word to retrieve its definition: Welcome
//Definition: To greet someone polite way
//Dictionary Application Menu:
//1. Add word-definition pair
//2. Retrieve definition by word
//3. Display all word-definition pairs
//4. Exit
//Enter your choice: 2
//Enter a word to retrieve its definition: Hello
//Definition: To greet someone
//Dictionary Application Menu:
//1. Add word-definition pair
//2. Retrieve definition by word
//3. Display all word-definition pairs
//4. Exit
//Enter your choice: 3
//All word-definition pairs in alphabetical order:
//Hello - To greet someone
//Welcome - To greet someone polite way
//Dictionary Application Menu:
//1. Add word-definition pair
//2. Retrieve definition by word
//3. Display all word-definition pairs
//4. Exit
//Enter your choice: 4
//Exiting the dictionary application.
