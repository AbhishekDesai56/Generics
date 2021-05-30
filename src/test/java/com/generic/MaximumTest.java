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

    @Test
    public void integerMaxAtFirstPosition() {
        Integer maxX =  GetMaximumTest.testIntegerMaximum(maxAtFirstPosition[0], maxAtFirstPosition[1], maxAtFirstPosition[2]);
        Assertions.assertEquals(maxAtFirstPosition[0], maxX);
    }

    @Test
    public void integerMaxAtSecondPosition() {
        Integer maxY =  GetMaximumTest.testIntegerMaximum(maxAtSecondPosition[0], maxAtSecondPosition[1], maxAtSecondPosition[2]);
        Assertions.assertEquals(maxAtSecondPosition[1], maxY);
    }

    @Test
    public void integerMaxAtThirdPosition() {
        Integer maxZ =  GetMaximumTest.testIntegerMaximum(maxAtThirdPosition[0], maxAtThirdPosition[1], maxAtThirdPosition[2]);
        Assertions.assertEquals(maxAtThirdPosition[2], maxZ);
    }


    @Test
    public void floatMaxAtFirstPosition() {
        Float maxX =  GetMaximumTest.testFloatMaximum(maxFloatAtFirstPosition[0], maxFloatAtFirstPosition[1], maxFloatAtFirstPosition[2]);
        Assertions.assertEquals(maxFloatAtFirstPosition[0], maxX);
    }

    @Test
    public void floatMaxAtSecondPosition() {
        Float maxY =  GetMaximumTest.testFloatMaximum(maxFloatAtSecondPosition[0], maxFloatAtSecondPosition[1], maxFloatAtSecondPosition[2]);
        Assertions.assertEquals(maxFloatAtSecondPosition[1], maxY);
    }

    @Test
    public void floatMaxAtThirdPosition() {
        Float maxZ =  GetMaximumTest.testFloatMaximum(maxFloatAtThirdPosition[0], maxFloatAtThirdPosition[1], maxFloatAtThirdPosition[2]);
        Assertions.assertEquals(maxFloatAtThirdPosition[2], maxZ);
    }
}
