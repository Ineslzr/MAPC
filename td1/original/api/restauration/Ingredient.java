package td1.original.api.restauration;

public class Ingredient {

    double weight;
    Base base;

    public Ingredient(Base base, double weight){
        this.base = base;
        this.weight = weight;
    }

    public double calories_per_100g(){

    }

    public double weight(){
        return weight;
    }

    public double calories(){

    }

    public double price(){

    }
}
