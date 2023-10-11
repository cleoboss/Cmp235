package main;

public class Test {
        public static int multiply(int a, int b) {
            if (a == 0 || b == 0) {
                throw new IllegalArgumentException("Both a and b must be non-zero");
            }
            return a * b;
        }

        public static String reverseString(String input) {
            if (input == null) {
                throw new IllegalArgumentException("Input cannot be null");
            }
            return new StringBuilder(input).reverse().toString();
        }
    }


