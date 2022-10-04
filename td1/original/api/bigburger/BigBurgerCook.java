package td1.original.api.bigburger;

import td1.original.api.general.*;

import java.util.ArrayList;
import java.util.List;

public class BigBurgerCook implements BurgerCook {

    private String name;
    private List<FoodProduct> products;

    public BigBurgerCook(String name, Size size, MeatType type){
        this.name = name;
        products = new ArrayList<>();
    }


    @Override
    public BurgerCook with_cheese() {
        return null;
    }

    @Override
    public BurgerCook with_onions() {
        return null;
    }

    @Override
    public BurgerCook with_sauce(SauceType sauce) {
        return null;
    }

    @Override
    public BurgerCook with_tomato() {
        return null;
    }

    @Override
    public Burger cook() {
        return null;
    }
}
