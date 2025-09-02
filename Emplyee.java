/*Scenario: A company in Bengaluru wants to maintain employee details and give a bonus to employees 
who have worked more than 5 years. 
Requirements: 
1. Create a class Employee with instance variables: name (String), salary (double), yearsOfService 
(int). 
2. Create static variable totalEmployees to store the number of employees created. 
3. Constructor should initialize all instance variables and increment totalEmployees. 
4. Create getters and setters for all instance variables. 
5. Create a method calculateBonus() that returns 5% of salary if yearsOfService > 5, otherwise 0. 
6. Create a static method showTotalEmployees() to print total employees created. 
7. Write a main class to create 3 employees, print their bonuses, and print total employees. 
Input Example: 
Employee1: Name: "Ravi", Salary: 150000, Years of Service: 6 
Employee2: Name: "Anita", Salary: 120000, Years of Service: 3 
Employee3: Name: "Suresh", Salary: 100000, Years of Service: 5*/

public class Emplyee{
 private String name;
 private double salary;
 private int yearOfService;
 
 public static int totalEmployees;
 
 public Emplyee(String name,double salary,int yearOfService){
	 this.name=name;
	 this.salary=salary;
	 this.yearOfService=yearOfService;
	 
	 totalEmployees++;
 }
 
 public String getName(){
	 return name;
 }
 
 public double getSalary(){
	 return salary;
 }
 public int getYearofservice(){
	 return yearOfService;
 }
 
 public void setName(String name){
	 this.name=name;
 }
 public void setSalary(double salary){
	 this.salary=salary;
 }
 public void setYearofservice(int yearOfService){
 this.yearOfService=yearOfService;
}

public double calculateBonus(){
	if(yearOfService>5){
		return 0.05*salary;
	}
		else{
			return 0.0;
		}
	}
public static void showTotalEmployees(){
	System.out.println("Total Employees "  +totalEmployees);
}

public static void main(String args[]){
	Emplyee emp1=new Emplyee("Ravi", 150000, 6);
    Emplyee emp2 = new Emplyee("Anita", 120000, 3);
    Emplyee emp3 = new Emplyee("Suresh", 100000, 5);
	
	
	System.out.println(emp1.getName()+  " Bonus: " + emp1.calculateBonus());
	
	System.out.println(emp2.getName()+  " Bonus: " + emp2.calculateBonus());
	
	System.out.println(emp3.getName()+  " Bonus: " + emp3.calculateBonus());
	
	Emplyee.showTotalEmployees();
	
}

	
}

