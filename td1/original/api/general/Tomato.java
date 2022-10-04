package td1.original.api.general;

import td1.original.api.monetary.Product;

public class Tomato implements FoodProduct {

    private double weight;
    private final double BASE_PRICE = 0.5;

    public Tomato(double weight) {
        this.weight = weight;
    }

    @Override
    public double calories() {
        return 0;
    }


    public double weight() {
        return weight;
    }
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    public String toString() {
        return String.format("tomato, qty: %.0f -- %.2f", weight(), price());
    }

    @Override
    public double calories_per_100g() {
        return weight * calories_per_100g() / 100;
    }
}
