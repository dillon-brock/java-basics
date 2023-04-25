package dev.dillonbrock;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String instructions = "Available actions:\n" +
                "0 – to shutdown\n" +
                "1 – to add item(s) to list (comma delimited list)\n" +
                "2 – to remove any items (comma delimited list)\n" +
                "Enter a number for which action you want to perform:  ";
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int taskNum = -1;

        while (taskNum != 0) {
            System.out.println(instructions);
            taskNum = Integer.parseInt(scanner.nextLine());

            if (taskNum == 1) {
                addItems(list);
            }
            if (taskNum == 2) {
                removeItems(list);
            }
            list.sort(Comparator.naturalOrder());
            System.out.println(list);
        }
    }

    private static void addItems(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the items you want to add to your list, separated by commas");
        String items = scanner.nextLine();
        String[] splitItems = items.split(",");

        for (int i = 0; i < splitItems.length; i++) {
            splitItems[i] = splitItems[i].trim();
        }

        for (String item : splitItems) {
            if (!list.contains(item)) list.add(item);
        }

    }

    private static void removeItems(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the itmes you want to remove from your list, separated by commas");
        String items = scanner.nextLine();
        String[] splitItems = items.split(",");

        for (int i = 0; i < splitItems.length; i++) {
            splitItems[i] = splitItems[i].trim();
        }

        list.removeAll(List.of(splitItems));
    }
}
