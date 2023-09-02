package shopping.product.food;

import shopping.cart.CartItem;

public class FoodItem implements CartItem {
    private String name;
    private double cost;

    public FoodItem(String name, double cost) {
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
