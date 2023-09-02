package shopping.payment;

public class CashProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Наличными оплачено: $" + amount);
    }
}
