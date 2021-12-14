package com.bridgelabz.Generics;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.generics.testcases.Maximum;

/**
 * Unit test for simple App.
 */
public class MaximumTest {
    @Test
    public void intMax() {
        int actualValue = Maximum.testMaximum(10, 20, 5);
        Assert.assertEquals(20, actualValue);
    }

    @Test
    public void floatMax() {
        float actualValue = Maximum.testMaximum(11f,52f,36f);
        Assert.assertEquals(52f,actualValue,0);
    }

    @Test
    public void stringMax() {
        String actualValue = Maximum.testMaximum("ABC","def","xyz");
        Assert.assertEquals("xyz",actualValue);
    }
}