/*Problem 3: Library Book Tracker 
Scenario: A library in Delhi wants to track how many books are issued in total and details of each book. 
Requirements: 
1. Create a Book class with instance variables: title (String), author (String), issued (boolean). 
2. Create static variable totalIssuedBooks to keep track of the total number of books issued. 
3. Create a constructor to initialize the book details. 
4. Create getters and setters for all instance variables. 
5. Create a static method showTotalIssued() to print total issued books. 
6. Write a main class to create 3 books, issue some of them (issued = true), and show total issued 
books. 
Input Example: 
Book1: "Harry Potter", Author: "J.K. Rowling", Issued: true 
Book2: "Five Point Someone", Author: "Chetan Bhagat", Issued: false 
Book3: "Rich Dad Poor Dad", Author: "Robert Kiyosaki", Issued: true */

public class Book {

private String title;
private String author;
private boolean issued;

private static int totalIssuedBooks;


public Book(String title,String author,boolean issued){
	this.title=title;
	this.author=author;
	this.issued=issued;


if(issued){
	totalIssuedBooks++;
}
}

public String getTitle(){
	return title;
}

public String getAuthor(){
	return author;
}

public boolean isIssued(){
	return issued;
}

public void setTitle(String title){
	this.title=title;
}
public void setAuthor(String author){
	this.author=author;
}

public void setissued (boolean issued){
	if(this.issued!=issued){
		if(issued)
			totalIssuedBooks++;
	}
	else{
		totalIssuedBooks--;
	}
	
this.issued=issued;
}

 public static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }

 public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("Harry Potter", "J.K. Rowling", false);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", false);

        // Show total issued books
        Book.showTotalIssued();
    }
}