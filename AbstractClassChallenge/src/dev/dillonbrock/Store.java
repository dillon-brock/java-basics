package dev.dillonbrock;

// store class should:
    // manage a list of products for sale, including displaying the product details
    // manage an order, which can just be a list of OrderItem objects
    // have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt

import java.util.ArrayList;

public class Store {

    private ArrayList<ProductForSale> productsForSale = new ArrayList<>();

    public static void main(String[] args) {


    }

    public void displayDetails() {
        for (ProductForSale product : productsForSale) {
            System.out.println("-".repeat(30));
            product.showDetails();
        }
    }
}