package com.generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MaximumTest {
    Integer[] maxAtFirstPosition = {3,2,1};
    Integer[] maxAtSecondPosition = {2,3,1};
    Integer[] maxAtThirdPosition = {2,1,3};
    Float[] maxFloatAtFirstPosition = {3.0f,2.0f,1.0f};
    Float[] maxFloatAtSecondPosition = {2.0f,3.0f,1.0f};
    Float[] maxFloatAtThirdPosition = {2.0f,1.0f,3.0f};
    String[] maxStringAtFirstPosition = {"Peach","Apple","Banana"};
    String[] maxStringAtSecondPosition = {"Apple","Peach","Banana"};
    String[] maxStringAtThirdPosition = {"Apple","Banana","Peach"};

    @Test
    public void givenTestMaximumInteger() {
        GetMaximumTest getMaximumTest =  new GetMaximumTest(3,1,2);
        Integer max = (Integer) getMaximumTest.testGenericMaximum();
        Assertions.assertEquals(3, max);
    }

    @Test
    public void givenTestMaximumFloat() {
        GetMaximumTest getMaximumTest =  new GetMaximumTest(3.0f,1.0f,2.0f);
        Float max = (Float) getMaximumTest.testGenericMaximum();
        Assertions.assertEquals(3.0f, max);
    }

    @Test
    public void givenTestMaximumString() {
        GetMaximumTest getMaximumTest =  new GetMaximumTest("Apple","Peach", "Banana");
        String max = (String) getMaximumTest.testGenericMaximum();
        Assertions.assertEquals("Peach", max);
    }
}
