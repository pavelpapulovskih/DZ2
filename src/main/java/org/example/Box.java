package org.example;

import java.util.ArrayList;
import java.util.List;
// Контейнерный компонент
class Box implements Component {
    List<Component> toys = new ArrayList<>();

    public void add(Component toy) {
        toys.add(toy);
    }

    public void remove(Component toy) {
        toys.remove(toy);
    }

    @Override
    public void display() {
        System.out.println("Box contents:");
        for (Component toy : toys) {
            toy.display();
        }
    }
}
