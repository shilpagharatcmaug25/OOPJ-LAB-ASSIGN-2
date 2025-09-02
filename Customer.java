/*Problem 7: Indian Movie Ticket Booking 
Scenario: 
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with 
ticket type. Keep track of total tickets sold using a static counter. 
Tasks: 
1. Create a Customer class. 
2. Implement two constructors: 
Constructor 1 → Customer(String name) 
Constructor 2 → Customer(String name, String ticketType) 
3. Static counter to track tickets sold. 
4. Print customer details and total tickets sold. 
Input Example: 
Customer1: "Rahul" 
Customer2: "Pooja", "Premium" 
Customer3: "Amit"*/

public class Customer{
	private String name;
	private String ticketType;
	private static int ticketsSold=0;
	
	
public Customer(String name){
	this.name=name;
	ticketsSold++;
}

public Customer(String name,String ticketType){
	this.name=name;
	this.ticketType=ticketType;
	this.ticketType="Premium" ;
	ticketsSold++;
}

public void printDetails() {
        System.out.println("Customer Name: " + name);
		System.out.println(" " + ticketType);
		System.out.println("-----------------------");
		
}
public static int getTotalTickets() {
        return ticketsSold;
    }
	
public static void main(String args[]){
	
	Customer c1=new Customer("Rahul");
	Customer c2=new Customer("Pooja", "Premium");
	Customer c3=new Customer("Amit");

c1.printDetails();
c2.printDetails();
c3.printDetails();

System.out.println("Total tickets booked:" +Customer.getTotalTickets());
}
}
