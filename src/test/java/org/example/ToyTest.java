package org.example;

import org.junit.Test;

public class ToyTest extends ComponentTest {

    @Override
    protected Component createComponent() {
        return new Toy("Car");
    }

    @Override
    protected String getExpectedOutput() {
        return "Toy: Car";
    }
}
