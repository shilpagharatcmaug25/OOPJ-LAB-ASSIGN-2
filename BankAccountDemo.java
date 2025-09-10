class Account{

int accountno;
double balance;

public Account(int accountno,double balance){
this.accountno=accountno;
this.balance=balance;

}

public void display(){
System.out.println("Account No :" + accountno + ", Balance :" + balance);

}
}

class SavingAccount extends Account{
  double interestRate;
  
  public SavingAccount(int accountno, double balance, double interestRate) {
        super(accountno, balance);
        this.interestRate = interestRate;
    }
  
  @Override
  
  public void display() {
        System.out.println("Saving → " + accountno + ", Balance = " + balance + ", Interest = " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(int accountno, double balance, double overdraftLimit) {
        super(accountno, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void display() {
        System.out.println("Current → " + accountno + ", Balance = " + balance + ", Overdraft = " + overdraftLimit);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount(101, 5000, 5);
        CurrentAccount current = new CurrentAccount(102, 10000, 2000);

        saving.display();
        current.display();
    }
}