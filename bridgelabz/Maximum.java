package com.bridgelabz;

    class GenericsClass<T extends Comparable> {
        T a;
        T b;
        T c;

        public GenericsClass(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public T testCase() {
            T max = a;
            if (b.compareTo(max) > 0) {
                max = b;
            }
            if (c.compareTo(max) > 0) {
                max = c;
            }
            return max;
        }
    }

    public class Maximum {
        public static void main(String[] args) {
            System.out.println("Welcome Generics program to find maximum");
            {
                GenericsClass<Integer> genericClass = new GenericsClass<>(2, 8, 9);
                GenericsClass<Float> genericClass1 = new GenericsClass<>(2.4f, 8.5f, 5.9f);
                GenericsClass<String> genericClass2 = new GenericsClass<>("Nokia", "Samsung", "Oneplus");
                System.out.println(genericClass.testCase());
                System.out.println(genericClass1.testCase());
                System.out.println(genericClass2.testCase());
            }
        }
    }
