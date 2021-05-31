package com.generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MaximumTest {

    @Test
    public void givenTestMaximumInteger() {
        GetMaximumTest getMaximumTest = new GetMaximumTest(3, 1, 2, 4);
        Integer max = (Integer) getMaximumTest.testGenericMaximum();
        Assertions.assertEquals(4, max);
    }

    @Test
    public void givenTestMaximumFloat() {
        GetMaximumTest getMaximumTest = new GetMaximumTest(3.0f, 1.0f, 2.0f, 4.0f);
        Float max = (Float) getMaximumTest.testGenericMaximum();
        Assertions.assertEquals(4.0f, max);
    }

    @Test
    public void givenTestMaximumString() {
        GetMaximumTest getMaximumTest = new GetMaximumTest("Apple", "Peach", "Banana", "Abcd");
        String max = (String) getMaximumTest.testGenericMaximum();
        Assertions.assertEquals("Peach", max);
    }
}
