package td1.original.api.burger;

import td1.original.api.restauration.Base;

public enum BurgerMeat implements Base {

    BEEF, WHITEFISH;

    public double calories_per_100g(){
        switch(this) {
            case BEEF:
                return 200;
            case WHITEFISH:
                return 170;
            default:
                return 0.0;
        }
    }

    public double price(){
        double rtr;
        switch(this) {
            case BEEF:
                rtr = 6;
                break;
            case WHITEFISH:
            default:
                rtr = 4;
        }
        return rtr;
    }

    @Override
    public boolean haseUniquePrice() {
        return false;
    }
}
