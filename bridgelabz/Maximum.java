package com.bridgelabz;

public class Maximum {
    public static <T extends Comparable> T testCase(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics program to find maximum");
        System.out.println("Maximum Of Three Integers is :" + testCase(2, 8, 9));
        System.out.println("Maximum Of Three Floats is :" + testCase(2.4f, 8.5f, 5.9f));
        System.out.println("Maximum Of Three Strings is :" + testCase("Nokia", "Samsung", "Oneplus"));

    }
}