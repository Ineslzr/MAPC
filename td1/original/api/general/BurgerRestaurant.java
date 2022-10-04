package td1.original.api.general;

public interface BurgerRestaurant {
    BurgerCook order_menu(MenuType menu);
    BurgerCook order_personal(Size size, MeatType type);
}
