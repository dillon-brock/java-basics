package dev.dillonbrock;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomerByName(String name) {

        for (Customer c : customers) {
            if (c.getName() == name) return c;
        }
        System.out.println("Customer " + name + " not found");
        return null;
    }

    public void addCustomer(String name, double initialDeposit) {

        if (getCustomerByName(name) == null) {
            Customer customer = new Customer(name, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer.getName());
        }

    }

    public void addCustomerTransaction(String name, double amount) {

        Customer customer = getCustomerByName(name);
        if (customer != null) {
            customer.addTransaction(amount);
            System.out.println("Transaction for amount $" + amount +
                    " added to " + name + "'s account");
        }
    }

    public void printStatement(String customerName) {

        Customer customer = getCustomerByName(customerName);
        if (customer == null) return;

        System.out.println("_".repeat(30));
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Transactions: ");
        for (double d : customer.getTransactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}

class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialDeposit) {
        this.name = name;
        transactions.add(initialDeposit);
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
