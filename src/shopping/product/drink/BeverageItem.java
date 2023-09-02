package shopping.product.drink;

import shopping.cart.CartItem;

public class BeverageItem implements CartItem {
    private String name;
    private double cost;

    public BeverageItem(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
