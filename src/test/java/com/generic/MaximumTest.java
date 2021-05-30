package com.generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    Integer[] maxAtFirstPosition = {3,2,1};
    Integer[] maxAtSecondPosition = {2,3,1};
    Integer[] maxAtThirdPosition = {2,1,3};

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
}
