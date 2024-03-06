package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class ComponentTest {

    @Test
    public void testDisplay() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Component component = createComponent();
        component.display();

        Assert.assertEquals("Expected output does not match actual output",
                getExpectedOutput(), outContent.toString().trim());
    }

    protected abstract Component createComponent();

    protected abstract String getExpectedOutput();
}
