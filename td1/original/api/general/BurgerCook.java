package td1.original.api.general;

public interface BurgerCook {
    BurgerCook with_cheese();
    BurgerCook with_onions();
    BurgerCook with_sauce(SauceType sauce);
    BurgerCook with_tomato();
    Burger cook();
}
