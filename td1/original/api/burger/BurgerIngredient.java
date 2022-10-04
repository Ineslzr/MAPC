package td1.original.api.burger;

import td1.original.api.restauration.Base;

public enum BurgerIngredient implements Base {

    CHEDDAR, DEEPFRIEDONIONS,TOMATO;

    public double calories_per_100g(){
        switch(this) {
            case CHEDDAR:
                return 400;
            case DEEPFRIEDONIONS:
                return 590;
            case TOMATO:
                return 50;
            default:
                return 0.0;
        }
    }

    public double price(){
        switch(this) {
            case CHEDDAR:
                return 4;
            case DEEPFRIEDONIONS:
                return 1.5;
            case TOMATO:
                return 0.5;
            default:
                return 0.0;
        }
    }

    @Override
    public boolean haseUniquePrice() {
        return false;
    }
}
