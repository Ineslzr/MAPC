package td1.original.api.general;

public enum MeatType implements FoodConstituent {

    BEEF, WHITEFISH;

    @Override
    public double calories_per_100g() {
        switch(this) {
            case BEEF:
                return 200;
            case WHITEFISH:
                return 170;
            default:
                return 0.0;
        }
    }

    double price(){
        return 0;
    }
}
