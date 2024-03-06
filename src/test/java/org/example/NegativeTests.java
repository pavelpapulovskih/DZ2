package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NegativeTests {

    @Test
    public void testEmptyBoxDisplay() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Box emptyBox = new Box();
        emptyBox.display();

        Assert.assertEquals("Empty box should display nothing", "", outContent.toString().trim());
    }
}

