package dev.dillonbrock;

public class Tent extends ProductForSale{

    private int capacity;

    public Tent(String type, double price, String description, int capacity) {
        super(type, price, description);
        this.capacity = capacity;
    }

    @Override
    public void showDetails() {
        System.out.println(capacity + "-person waterproof tent with rain cover");
        System.out.println("Quick and easy setup");
        System.out.println("Durable, ready for your next adventure");
    }
}
