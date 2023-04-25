package dev.dillonbrock;

public class Jacket extends ProductForSale{

    public Jacket(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("""
                Waterproof coat with fleece lining
                Comes w/ detachable hood
                Lightweight and comfortable
                Perfect for hiking and camping in all weather""");
    }
}
