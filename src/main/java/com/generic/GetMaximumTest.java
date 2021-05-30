package com.generic;

public class GetMaximumTest {

    public static <E extends Comparable<? super E>> E testGenericMaximum(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
