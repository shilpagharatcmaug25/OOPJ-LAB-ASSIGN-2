interface Payment{

void pay(double amount);

}

class CreditCard implements Payment{
@Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}
class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + amount);
    }
}
public class PaymentProcessor {
    public static void main(String[] args) {
        
        Payment creditCard = new CreditCard();
        Payment paypal = new PayPalPayment();

       
        double ccAmount = 2500;
        double paypalAmount = 1500;

       
        creditCard.pay(ccAmount);
        paypal.pay(paypalAmount);
    }
}