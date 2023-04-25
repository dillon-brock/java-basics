// TODO:

// main method:
    // create a default meal, that uses the no arguments constructor
    // create a meal with a burger, drink and side with up to 3 extra toppings
    // create meal with deluxe burger, where all items, drink, side,
    // and up to 5 extra toppings are included in the burger price

// for each meal order:
    // add some additional toppings to the burger
    // change the size of the drink
    // print itemized list:
    // includes price of burger, extra toppings, drink price based on size, side price
    // print the total due amount for the meal


public class Main {

    public static void main(String[] args) {
        Meal defaultMeal = new Meal();
        defaultMeal.getBurger().addToppings("mustard", 0.10);
        System.out.println(defaultMeal.getDrink().getPrice());
        defaultMeal.getDrink().setSize("large");
        System.out.println(defaultMeal.getDrink().getPrice());
        defaultMeal.getItemizedList();
        defaultMeal.getTotalPrice();

        Burger myBurger = new Burger("Bacon Cheeseburger", 3.50, false);
        Drink myDrink = new Drink("Pepsi", "medium");
        Side mySide = new Side("Onion Rings", 2.40);
        Meal myMeal = new Meal(myBurger, myDrink, mySide);
        myMeal.getBurger().addToppings(new String[] {"onions", "pickles", "ketchup"}, new double[] {0.25, 0.25, 0.10});
        myMeal.getDrink().setSize("small");
        myMeal.getItemizedList();
        myMeal.getTotalPrice();

        Burger deluxeBurger = new Burger("Cheeseburger", 2.40, true);
        Drink deluxeDrink = new Drink("Root Beer", "large");
        Side deluxeSide = new Side("Salad", 2.75);
        Meal deluxeMeal = new Meal(deluxeBurger, deluxeDrink, deluxeSide);
        deluxeMeal.getBurger().addToppings(new String[] {"onions", "pickles", "ketchup", "mushrooms", "mustard"},
                new double[] {0.25, 0.25, 0.10, 0.50, 0.10});
        deluxeMeal.getItemizedList();
        deluxeMeal.getTotalPrice();



    }
}









// DONE:
// The drink:
// has at least type, size, and price
// price of the drink changes for each size

// The side:
// has at least type and price

// The burger:
// has type, base price, up to 3 extra toppings
// the constructor includes only burger type and price
// extra toppings need to be added somehow,
// and priced according to their type

// The meal:
// composed of exactly one burger, one drink, one side
// most common order created without any arguments (constructor overloading)
// create other meals by specifying different burgers, drinks, sides

// deluxe burger bonus:
// create a deluxe burger meal with a deluxe burger,
// that has a set price so additional toppings do not change the price
// has room for additional two toppings
