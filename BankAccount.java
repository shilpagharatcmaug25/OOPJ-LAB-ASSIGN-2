public class BankAccount{

private double balance;

public BankAccount(){
	
	this.balance=0.0;
	
}

public void deposit(double amount){
	if(amount>0){
		balance+=amount;
		System.out.println("Successfully deposited: " + amount);
	}
else{
	System.out.println("Invalid amount received");
	
}
}
public void withdraw(double amount){
	if(amount>0){
		balance-=amount;
		System.out.println("Amount withdraw : " +amount);
	}
		else{
			System.out.println("Insufficient balance");
		}
	}
		
	public double getBalance(){
		return balance;
	}
	
	public static void main(String args[]){
		BankAccount account=new BankAccount();
		
		account.deposit(5000);
		
		System.out.println("Current Balance :" +account.getBalance());
		
		account.withdraw(2000);
		System.out.println("Current Balance :" +account.getBalance());
	}
	}





