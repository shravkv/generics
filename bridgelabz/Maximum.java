package com.bridgelabz;

import java.util.Arrays;

public class Maximum {

        public static <T> T testCase(T... a) {
            Arrays.sort(a);
            return a[a.length - 1];
        }

        public static void main(String[] args) {
            System.out.println("Welcome Generics program to find maximum");
            System.out.println("Maximum of Integer values is :" + testCase(2, 6, 9, 105,4, 9, 25, 59, 94));
            System.out.println("Maximum of Float Values is :" + testCase(2.4f, 5.9f, 2.8f, 8.6f, 10.7f));
            System.out.println("Maximum of String values is :" + testCase("Sony", "Bird", "June", "Dog", "Egg", "Fox", "Grill"));
        }
    }
