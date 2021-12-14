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
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue1() {
        int actualResult = Maximum.testMaximum(12, 4, 6);
        Assert.assertEquals(12, actualResult);
    }

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue2() {
        int actualResult = Maximum.testMaximum(250, 500, 61);
        Assert.assertEquals(500, actualResult);
    }

    @Test
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue3() {
        int actualResult = Maximum.testMaximum(480, 720, 1040);
        Assert.assertEquals(1040, actualResult);
    }

    @Test
    public void givenValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        int actualResult = Maximum.testMaximum(360,480,720);
        Assert.assertEquals(2080, actualResult);
    }

    @Test
    public void given3floatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        float actualResult = Maximum.testMaximum(10.11f, 10.01f, 10.0f);
        Assert.assertEquals(10.11f, actualResult ,0);
    }

    @Test
    public void given3floatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        float actualResult = Maximum.testMaximum(101.1f, 1011.0f, 100f);
        Assert.assertEquals(1011f, actualResult,0);
    }

    @Test
    public void given3flaotValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        float actualResult = Maximum.testMaximum(1.0f, 8.0f,1024.0f);
        Assert.assertEquals(1024f, actualResult,0);
    }

    @Test
    public void givenfloatValues_WhenGetMaximum_ShouldReturnCorrectValue() {
        float actualResult = Maximum.testMaximum(36.0f, 480.0f, 72.0f);
        Assert.assertEquals(480.0f, actualResult,0);
    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        String actualResult = Maximum.testMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", actualResult);
    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
       String  actualResult = Maximum.testMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", actualResult);
    }

    @Test
    public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        String actualResult = Maximum.testMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", actualResult);
    }

    @Test
    public void givenStringValues_WhenGetMaximum_ShouldReturnCorrectValue() {
        String actualResult = Maximum.testMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Strawberry", actualResult);
    }
}