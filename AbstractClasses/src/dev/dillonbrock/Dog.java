package dev.dillonbrock;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        System.out.print(getExplicitType() + (speed.equals("slow") ?
                "Walking " : "Running "));
    }

    @Override
    public void makeNoise() {

        System.out.print(getExplicitType() == "Wolf" ?
                "Howling! " : "Woof! ");
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }
}
