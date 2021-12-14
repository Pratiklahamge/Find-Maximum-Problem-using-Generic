package com.bridgelabz.Generics;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.generics.testcases.Maximum;

/**
 * Unit test for simple App.
 */

public class MaximumTest
{
    @Test
    public void intMax() {
        int assertValue = Maximum.getmaximum(10,20,5);
        Assert.assertEquals(20,assertValue);
    }
    public void floatMax() {
        float assertValue = Maximum.getmaximum(10f,20f,5f);
        Assert.assertEquals(20,assertValue,0);
    }
    public void stringMax() {
        String assertValue = Maximum.getmaximum("abc","def","ghi");
        Assert.assertEquals("ghi",assertValue);
    }
}