package org.example;

public class CompositePatternExample {
    public static void main(String[] args) {
        Toy car = new Toy("Car");
        Toy doll = new Toy("Doll");

        Box bigBox = new Box();
        Box smallBox = new Box();

        smallBox.add(car);
        smallBox.add(doll);

        bigBox.add(smallBox);

        bigBox.display();
    }
}