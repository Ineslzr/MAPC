package td1.original.api.burger;

import td1.original.api.restauration.ComposedFood;

public class BurgerBuilder{

    String name;

    private BurgerBuilder() {
        Burger b = new Burger(name);
        //BurgerMeat b = BurgerMeat.BEEF;
    }

    public static BurgerBuilder order_menu(String name, MenuType type){

    }

    public BurgerBuilder order_beef(String name, MenuSize size){

    }

    public BurgerBuilder order_fish(String name, MenuSize size){

    }

    public BurgerBuilder with_barbecue_sauce(){

    }

    public BurgerBuilder with_bearnaise_sauce(){

    }

    public BurgerBuilder with_burger_sauce(){

    }

    public BurgerBuilder with_cheddar(){

    }

    public BurgerBuilder with_onions(){

    }

    public BurgerBuilder with_tomato(){

    }

    public ComposedFood cook(){

    }






}
