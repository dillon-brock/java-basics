package dev.dillonbrock;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedLineItem(int quantity) {

        double salesPrice = getSalesPrice(quantity);
        System.out.printf("%d  %s  $%8.2f%n", quantity, type, salesPrice);
    }

    public abstract void showDetails();

}
