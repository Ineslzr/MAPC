package td1.original.api.restauration;

import java.util.ArrayList;
import java.util.List;

public abstract class Recipe {

    String name;
    List<Food> ingredients;

    public Recipe(String name){

        this.name = name;
        ingredients = new ArrayList<>();
    }

    public abstract String name();

    public abstract void add(Base base, double weight);

    public abstract double calories_per_100g();

    public abstract double weigth();

    public abstract double calories();

    public abstract double price();
}
