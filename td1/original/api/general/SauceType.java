package td1.original.api.general;

public enum SauceType implements FoodConstituent {

    BURGER,BARBECUE,BEARNAISE;

    @Override
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
}
