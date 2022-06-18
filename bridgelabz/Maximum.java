package com.bridgelabz;

import java.util.Arrays;

public class Maximum<T> {

    public static void main(String[] args) {
        System.out.println("Welcome Generics program to find maximum");
        Maximum<Integer> integerMaximum = new Maximum<>();
        Maximum<Float> floatMaximum = new Maximum<>();
        Maximum<String> stringMaximum = new Maximum<>();
        integerMaximum.testCase(10, 8, 4, 23, 21);
        floatMaximum.testCase(2.4f, 3.8f, 6.8f, 8.2f, 1.6f);
        stringMaximum.testCase("Apple", "May", "Juice", "King", "Cat", "Rice");
    }

    public T testCase(T... a) {
        Arrays.sort(a);
        T max = a[a.length - 1];
        printMax(max);
        return max;
    }

    private void printMax(T max) {
        System.out.println(max);
    }
}
