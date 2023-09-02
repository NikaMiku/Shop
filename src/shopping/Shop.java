package shopping;

import shopping.cart.CartItem;
import shopping.payment.PaymentProcessor;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private double balance;
    private List<CartItem> cartItems;
    private PaymentProcessor paymentProcessor;

    public Shop(double initialBalance, PaymentProcessor processor) {
        balance = initialBalance;
        cartItems = new ArrayList<>();
        paymentProcessor = processor;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public  void addToCart(CartItem item) {
        cartItems.add(item);
    }

    public void removeFromCart(CartItem item) {
        cartItems.remove(item);
    }

    public void displayCart() {
        System.out.println("Состав корзиры:");
        for (CartItem item : cartItems) {
            System.out.println("- " + item.getName() + " ($" + item.getCost() + ")");
        }
    }

    public double getBalance() {
        return balance;
    }
    public void processPayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
}
