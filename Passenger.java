/*Indian Railway Ticket Booking 
Scenario: 
You are building a mini ticket booking system. A passenger can book a ticket either by giving name and 
age or name, age, and seat type. The system should also count the total tickets booked using a static 
counter. 
Tasks: 
1. Create a Passenger class. 
2. Implement two constructors (constructor overloading): 
Constructor 1 → Passenger(String name, int age) 
Constructor 2 → Passenger(String name, int age, String seatType) 
3. Use a static counter to keep track of total passengers booked. 
4. Print passenger details and total passengers. 
Input Example: 
Passenger1: "Ravi", 25 
Passenger2: "Anita", 30, "AC Sleeper" 
Passenger3: "Suresh", 40 */

class Passenger{
	private String name;
	private int age;
	private String seatType;
	private static int passengerCount=0;
	
public Passenger(String name,int age){
	this.name=name;
	this.age=age;
	this.seatType="General";
	passengerCount++;
}
public Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        passengerCount++;
    }
	public void printDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Seat Type: " + seatType);
        System.out.println("----------------------------");
    }

    // Static method to get total passengers
    public static int getTotalPassengers() {
        return passengerCount;
    }


    public static void main(String[] args) {
        // Creating passenger objects
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        // Printing passenger details
        p1.printDetails();
        p2.printDetails();
        p3.printDetails();

        // Printing total passengers
        System.out.println("Total Passengers Booked: " + Passenger.getTotalPassengers());
    }
}

