package shopping.product.drink;

import shopping.cart.CartItem;

public class DrinkItem implements CartItem {
    private String name;
    private double cost;

    public DrinkItem(String name, double cost) {
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
