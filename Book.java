package arrayListDemo;

import java.util.ArrayList;

public class Book {
	
       //Declare variable 
		private long bookId;
		private String bookName;
		private String authorName;
		
       //Create a parameterized constructor
		public Book (long bookId ,String bookName , String authorName ) {
			 
			 this.bookId = bookId;
			 this.bookName = bookName;
			 this.authorName = authorName;
		 }
		
		//Using get method 
		public long getBookId() {
			return bookId;
		}
		
		public String getBookName() {
			return bookName;
		}
		
		public String getAuthorName() {
			return authorName;
		}
	
public static void main(String []args) {
	
	ArrayList<Book> books = new ArrayList<>();
	
	//create book objects and add into arraylist
	Book book1 = new Book(2324352, "Kalyani", "Aman Saini");
	Book book2 = new Book(7857333, "Saurabh", "Sundip Kisan");
	Book book3 = new Book(9687857, "Rd Shrama", "Deepak Sahu");
	
	books.add(book1);
	books.add(book2);
	books.add(book3);
	
	//Using advance for loop display book details
	for(Book book : books) {
		System.out.println("Book ID: "+book.getBookId());
		System.out.println("Book Name: "+book.getBookName());
		System.out.println("Author Name: "+book.getAuthorName());
		System.out.println();
	}
  }
}

//-------------------OUTPUT------------------
//Book ID: 2324352
//Book Name: Kalyani
//Author Name: Aman Saini
//
//Book ID: 7857333
//Book Name: Saurabh
//Author Name: Sundip Kisan
//
//Book ID: 9687857
//Book Name: Rd Shrama
//Author Name: Deepak Sahu