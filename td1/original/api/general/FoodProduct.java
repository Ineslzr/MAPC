package td1.original.api.general;

public interface FoodProduct extends Product,FoodConstituent{

    default double calories() {
        return 0;
    }
}
