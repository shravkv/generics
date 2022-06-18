package com.bridgelabz;

public class Maximum {
    public static Float testCase(Float a, Float b, Float c) {
        Float max = a;
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
        System.out.println("Maximum Of Three Floats is :" + testCase(2.4f, 8.5f, 5.9f));
    }
}