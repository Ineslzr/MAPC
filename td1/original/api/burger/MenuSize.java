package td1.original.api.burger;

public enum MenuSize {
    SMALL, MEDIUM, BIG;

    public double meatWeight(){

        switch(this) {
            case SMALL:
                return 100;
            case MEDIUM:
                return 200;
            case BIG:
                return 400;
            default:
                return 0.0;
        }

    }
}
