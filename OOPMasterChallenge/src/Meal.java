public class Meal {

    private Burger burger;
    private Drink drink;
    private Side side;

    public Meal() {
        this.burger = new Burger("Hamburger", 2.75, false);
        this.drink = new Drink("Coke", "small");
        this.side = new Side("Fries", 2.10);
    }

    public Meal(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public Side getSide() {
        return side;
    }

    public void getItemizedList() {
        System.out.println(burger);
        System.out.println(drink);
        System.out.println(side);
    }

    public void getTotalPrice() {
        double totalPrice = burger.isDeluxe() ? burger.getPrice() :
                burger.getPrice() + drink.getPrice() + side.getPrice();
        System.out.println("The total price is " + totalPrice);
    }
}
