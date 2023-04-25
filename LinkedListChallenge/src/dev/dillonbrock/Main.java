package dev.dillonbrock;

// TODO:
    // use LinkedList functionality to create a list of places ordered by distance from the starting point
    // use a ListIterator to move backwards and forwards through this ordered itinerary of places
    // sydney is first element
    // no duplicates

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Town(String name, int distance) {
};

public class Main {

    final private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Town> towns = new LinkedList<>();
        populateList(towns);
        sortListByDistance(towns);

        ListIterator<Town> iterator = towns.listIterator();
        Town currentTown = towns.getFirst();

        String command = "";

        while (!command.equalsIgnoreCase("q") && !command.equalsIgnoreCase("quit")) {
            printActions();
            command = scanner.nextLine();
            switch (command) {
                case "m", "menu" -> {
                    continue;
                }
                case "l", "list places" -> listPlaces(towns);
                case "f", "forward" -> {
                    if (iterator.hasNext()) {
                        currentTown = iterator.next();
                        System.out.println("Moving on to " + currentTown.name());
                    } else {
                        System.out.println("You've reached the end of your journey!");
                    }
                }
                case "b", "backward" -> {
                    if (iterator.hasPrevious()) {
                        currentTown = iterator.previous();
                        System.out.println("Going back to " + currentTown.name());
                    } else {
                        System.out.println("You're at the beginning of your trip!");
                    }
                }
                default -> {}
            }

        }
    }

    private static void populateList(LinkedList<Town> list) {
        list.add(new Town("Adelaide", 1374));
        list.add(new Town("Alice Springs", 2771));
        list.add(new Town("Brisbane", 917));
        list.add(new Town("Darwin", 3972));
        list.add(new Town("Melbourne", 877));
        list.add(new Town("Perth", 3923));
        list.addFirst(new Town("Sydney", 0));
    }

    private static void sortListByDistance(LinkedList<Town> list) {

        boolean doneSorting = false;

        while (!doneSorting) {
            doneSorting = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).distance() > list.get(i + 1).distance()) {
                    doneSorting = false;
                    Town temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }

        }

    }

    public static void printActions() {
        System.out.println("Available actions (select word or letter):\n" +
                "(F)orward\n" +
                "(B)ackward\n" +
                "(L)ist Places\n" +
                "(M)enu\n" +
                "(Q)uit\n");
    }

    public static void listPlaces(LinkedList<Town> list) {
        for (Town town : list) {
            System.out.println(town.name() + ", " + town.distance() + " km from Sydney");
        }
    }


}
