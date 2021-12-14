package com.bridgelabz.Generics;
import org.junit.Assert;
import org.junit.Test;

import com.generics.testcases.Maximum;

/**
 * Unit test for simple App.
 */

public class MaximumTest {
	  @Test
	    public void stringMax1() {
	        String actualValue = Maximum.getmaximum("Aa","Bb","Cc");
	        Assert.assertEquals("Cc",actualValue);
	    }

	    @Test
	    public void stringMax2() {
	        String actualValue = Maximum.getmaximum("abc","ABC","def");
	        Assert.assertEquals("def", actualValue);
	    }

}
