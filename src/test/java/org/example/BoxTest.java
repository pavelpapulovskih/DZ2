package org.example;
import org.junit.Assert;
import org.junit.Test;

public class BoxTest extends ComponentTest {

    @Override
    protected Component createComponent() {
        Box box = new Box();
        box.add(new Toy("Car"));
        box.add(new Toy("Doll"));
        return box;
    }

    @Override
    protected String getExpectedOutput() {
        return "Box contents:\nToy: Car\nToy: Doll";
    }

    @Test
    public void testAddRemove() {
        Box box = new Box();
        Toy car = new Toy("Car");
        box.add(car);
        box.display();

        Assert.assertTrue("Box should contain added toy", box.toys.contains(car));

        box.remove(car);
        box.display();

        Assert.assertFalse("Box should not contain removed toy", box.toys.contains(car));
    }
}

