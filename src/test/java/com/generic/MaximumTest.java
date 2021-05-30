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
    public void integerMaxAtFirstPosition() {
        Integer maxX =  GetMaximumTest.testGenericMaximum(maxAtFirstPosition[0], maxAtFirstPosition[1], maxAtFirstPosition[2]);
        Assertions.assertEquals(maxAtFirstPosition[0], maxX);
    }

    @Test
    public void integerMaxAtSecondPosition() {
        Integer maxY =  GetMaximumTest.testGenericMaximum(maxAtSecondPosition[0], maxAtSecondPosition[1], maxAtSecondPosition[2]);
        Assertions.assertEquals(maxAtSecondPosition[1], maxY);
    }

    @Test
    public void integerMaxAtThirdPosition() {
        Integer maxZ =  GetMaximumTest.testGenericMaximum(maxAtThirdPosition[0], maxAtThirdPosition[1], maxAtThirdPosition[2]);
        Assertions.assertEquals(maxAtThirdPosition[2], maxZ);
    }

    @Test
    public void floatMaxAtFirstPosition() {
        Float maxX =  GetMaximumTest.testGenericMaximum(maxFloatAtFirstPosition[0], maxFloatAtFirstPosition[1], maxFloatAtFirstPosition[2]);
        Assertions.assertEquals(maxFloatAtFirstPosition[0], maxX);
    }

    @Test
    public void floatMaxAtSecondPosition() {
        Float maxY =  GetMaximumTest.testGenericMaximum(maxFloatAtSecondPosition[0], maxFloatAtSecondPosition[1], maxFloatAtSecondPosition[2]);
        Assertions.assertEquals(maxFloatAtSecondPosition[1], maxY);
    }

    @Test
    public void floatMaxAtThirdPosition() {
        Float maxZ =  GetMaximumTest.testGenericMaximum(maxFloatAtThirdPosition[0], maxFloatAtThirdPosition[1], maxFloatAtThirdPosition[2]);
        Assertions.assertEquals(maxFloatAtThirdPosition[2], maxZ);
    }

    @Test
    public void stringMaxAtFirstPosition() {
        String maxX =  GetMaximumTest.testGenericMaximum(maxStringAtFirstPosition[0], maxStringAtFirstPosition[1], maxStringAtFirstPosition[2]);
        Assertions.assertEquals(maxStringAtFirstPosition[0], maxX);
    }

    @Test
    public void stringMaxAtSecondPosition() {
        String maxY =  GetMaximumTest.testGenericMaximum(maxStringAtSecondPosition[0], maxStringAtSecondPosition[1], maxStringAtSecondPosition[2]);
        Assertions.assertEquals(maxStringAtSecondPosition[1], maxY);
    }

    @Test
    public void stringMaxAtThirdPosition() {
        String maxZ =  GetMaximumTest.testGenericMaximum(maxStringAtThirdPosition[0], maxStringAtThirdPosition[1], maxStringAtThirdPosition[2]);
        Assertions.assertEquals(maxStringAtThirdPosition[2], maxZ);
    }
}
