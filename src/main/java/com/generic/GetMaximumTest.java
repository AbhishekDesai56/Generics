package com.generic;


public class GetMaximumTest <E extends Comparable<E>> {
    public E x;
    public E y;
    public E z;
    public E parameterAdd;
    public E max;

    public GetMaximumTest(E x, E y, E z, E parameterAdd) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.parameterAdd = parameterAdd;
        testGenericMaximum();
    }

    public <E> E testGenericMaximum() {
        max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        if(parameterAdd.compareTo(max) > 0) {
            max = parameterAdd;
        }
        return (E) max;
    }
}
