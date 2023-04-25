package dev.dillonbrock;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        System.out.print(getExplicitType() + (speed.equals("slow") ?
                " lazily swimming " : " darting frantically"));
    }

    @Override
    public void makeNoise() {

        System.out.print(getExplicitType() == "Goldfish" ?
                "swish " : "splash");
    }
}
