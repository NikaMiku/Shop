package shopping.payment;

public class CreditCardProcessor implements PaymentProcessor{
    private String creditCardNumber;

    public CreditCardProcessor(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежа по кредитной карте в размере: $" + amount + " с номером карты: " + creditCardNumber);
    }
}
