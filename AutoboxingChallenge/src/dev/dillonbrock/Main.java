package dev.dillonbrock;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Chase");
        bank.addCustomer("Jane A", 500.0);
        System.out.println(bank);

        bank.addCustomerTransaction("Jane A", -10.25);
        bank.addCustomerTransaction("Jane A", -75.01);
        bank.addCustomerTransaction("Jane A", 124.12);
        bank.printStatement("Jane A");
    }
}
