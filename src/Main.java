import shopping.Shop;
import shopping.cart.CartItem;
import shopping.payment.CashProcessor;
import shopping.payment.CreditCardProcessor;
import shopping.payment.PaymentProcessor;
import shopping.product.drink.BeverageItem;
import shopping.product.food.FoodItem;

public class Main {
    public static void main(String[] args) {
        //Shop of credit
        PaymentProcessor creditCardProcessor = new CreditCardProcessor("123456****1234");
        Shop shop1 = new Shop(100.0, creditCardProcessor);
        //Shop of cash
        PaymentProcessor cashProcessor = new CashProcessor();
        Shop shop2 = new Shop(200.0, cashProcessor);

        shop1.addBalance(50.0);
        shop2.addBalance(100.0);
        System.out.println("Shop 1 Balance : $" + shop1.getBalance());
        System.out.println("Shop 2 Balance : $" + shop2.getBalance());

        CartItem food1 = new FoodItem("Pizza", 10.0);
        CartItem food2 = new FoodItem("Pasta", 12.5);
        CartItem food3 = new FoodItem("Chips", 5.9);
        CartItem drink1 = new BeverageItem("Coca-coca", 2.8);
        CartItem drink2 = new BeverageItem("Clear-Water", 1.5);
        CartItem drink3 = new BeverageItem("Juice", 3.0);

        shop1.addToCart(food1);
        shop1.addToCart(drink3);
        shop2.addToCart(food2);
        shop2.addToCart(drink1);
        shop1.displayCart();
        shop1.processPayment(13.0);
        shop1.removeFromCart(drink3);
        shop1.displayCart();
    }
}