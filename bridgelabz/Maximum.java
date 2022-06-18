package com.bridgelabz;

public class Maximum {
    public static String testCase(String a, String b, String c) {
        String max = a;
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
        System.out.println("Maximum Of Three Strings is :" + testCase("Nokia", "Samsung", "Oneplus"));

    }
}