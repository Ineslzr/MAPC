package td1.original.api.general;

import td1.original.api.monetary.Product;

public class Sauce implements FoodProduct {

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public double price() {
        return BASE_PRICE;
    }

    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return weight * calories_per_100g() / 100;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }

    public double calories_per_100g() {
        return type.calories_per_100g();
    }
}
