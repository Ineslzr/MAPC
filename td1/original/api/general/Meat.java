package td1.original.api.general;

import td1.original.api.monetary.Product;

public class Meat implements FoodProduct {

    private double weight;
    private MeatType type;

    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }

    @Override
    public double calories_per_100g() {
        return 0;
    }

    @Override
    public double calories() {
        return 0;
    }
}
