package org.example;

// Листовой компонент
class Toy implements Component {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Toy: " + name);
    }
}