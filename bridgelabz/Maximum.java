package com.bridgelabz;

public class Maximum {
    public static Integer testCase(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome Generics program to find maximum");
        System.out.println("Maximum Of Three Integers is :" + testCase(2, 8, 9));
    }
}