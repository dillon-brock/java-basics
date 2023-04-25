import java.util.ArrayList;
import java.util.Set;

public class Item {

    private String item;
    private double price;

    public Item(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}

class Burger extends Item {

    private ArrayList<String> toppings = new ArrayList<>();
    private Set<String> validToppings;
    private boolean isDeluxe;

    public Burger(String item, double price, boolean isDeluxe) {
        super(item, isDeluxe ? 10.00 : price);
        this.isDeluxe = true;
        this.validToppings = Set.of("onions", "tomatoes", "lettuce", "pickles",
                "ketchup", "mustard", "barbecue sauce", "mayo", "mushrooms");
    }

    public void addToppings(String topping, double toppingPrice) {
        if ((!isDeluxe && this.toppings.size() == 3) || (isDeluxe && this.toppings.size() == 5)) {
            System.out.println("You can't add any more toppings to your burger!");
            return;
        }

        if (!this.validToppings.contains(topping)) {
            System.out.println("This is not a valid topping choice!");
            return;
        }

        this.toppings.add(topping);
        if (!isDeluxe) setPrice(getPrice() + toppingPrice);
    }

    public void addToppings(String[] toppings, double[] toppingPrices) {
        if (toppings.length != toppingPrices.length) {
            System.out.println("Different number of toppings and prices.");
            return;
        }

        for (int i = 0; i < toppings.length; i++) {
            this.addToppings(toppings[i], toppingPrices[i]);
        }
    }

    public boolean isDeluxe() {
        return isDeluxe;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "toppings=" + toppings +
                ", validToppings=" + validToppings +
                ", isDeluxe=" + isDeluxe +
                "} " + super.toString();
    }
}

class Side extends Item {

    public Side(String item, double price) {
        super(item, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Drink extends Item {

    private String size;

    public Drink(String item, String size) {
        super(item, switch (size) {
            case "small" -> 1.50;
            case "medium" -> 2.00;
            case "large" -> 2.50;
            default -> 2.00;
        });
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
        setPrice(switch (size) {
            case "small" -> 1.50;
            case "medium" -> 2.00;
            case "large" -> 2.50;
            default -> 2.00;
        });
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                "} " + super.toString();
    }
}
