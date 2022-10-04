package td1.original.api.bigburger;

import td1.original.api.general.*;

public class BigBurgerRestaurant implements BurgerRestaurant {

    private static BigBurgerRestaurant instance = null;

    private BigBurgerRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new BigBurgerRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        return null;
    }

    @Override
    public BurgerCook order_personal(Size size, MeatType type) {
        return null;

    }

}
