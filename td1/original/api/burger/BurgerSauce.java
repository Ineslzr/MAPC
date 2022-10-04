package td1.original.api.burger;

import td1.original.api.restauration.Base;

public enum BurgerSauce implements Base {

    BURGER,BARBECUE,BEARNAISE;

    public double calories_per_100g(){
        switch(this) {
            case BURGER:
                return 240;
            case BARBECUE:
                return 130;
            case BEARNAISE:
                return 550;
            default:
                return 0.0;
        }
    }

    public double price(){
        return 1.0;
    }


    @Override
    public boolean haseUniquePrice() {
        return false;
    }
}
