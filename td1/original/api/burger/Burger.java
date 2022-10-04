package td1.original.api.burger;

import td1.original.api.restauration.Base;
import td1.original.api.restauration.Recipe;

public class Burger extends Recipe {


    public Burger(String name) {
        super(name);
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void add(Base base, double weight) {
        System.out.println("test");
    }

    @Override
    public double calories_per_100g() {
        return 0;
    }

    @Override
    public double weigth() {
        return 0;
    }

    @Override
    public double calories() {
        return 0;
    }

    @Override
    public double price() {
        return 0;
    }
}
