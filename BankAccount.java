/*Problem 8: Bank Account Initialization 
Scenario: 
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account 
has account holder name, balance, and interest rate. Students should practice static blocks for 
initialization and setters/getters to modify and access account details. 
Tasks: 
1. Create a BankAccount class. 
2. Use a static block to initialize interest rate to 4%. 
3. Create instance variables: name (String) and balance (double). 
4. Create setters and getters for name and balance. 
5. Print account details including interest rate. 
Input Example: 
Account1: Name="Rohit", Balance=5000 
Account2: Name="Priya", Balance=15000*/

public class BankAccount{
	
private String name;
private double balance;
private static double interestRate=4.0;

public BankAccount(String name,double balance){
	this.name=name;
	this.balance=balance;
}

 public String getName(){
	 return name;
 }
 
 public void setName(String name){
 this.name=name;
 
}

 public double getBalance(){
	 return balance;
 }
 public void setBalance(double balance){
	 this.balance=balance;
 }
 
 public double getInterestRate(){
	 return interestRate;
 }
  public void printaccountdetails(){
	  System.out.println("Account Holder Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("---------------------------");
    }
public static void main(String[] args) {
        // Creating Account 1
        BankAccount account1 = new BankAccount("Rohit", 5000);
        account1.printaccountdetails();

        // Creating Account 2
        BankAccount account2 = new BankAccount("Priya", 15000);
        account2.printaccountdetails();
    }
}

	  
 

