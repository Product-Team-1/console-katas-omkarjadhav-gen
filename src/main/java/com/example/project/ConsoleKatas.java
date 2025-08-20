package com.example.project;

/**
 * Starter code for eight katas.
 * Replace the TODOs with working implementations.
 */
public class ConsoleKatas {

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;
            if (by3 && by5) {
                System.out.println("FizzBuzz");
            } else if (by3) {
                System.out.println("Fizz");
            } else if (by5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String s = str.replaceAll("\\s+", "").toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    public static String reverseString(String str) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static int factorial(int n) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static String evenOrOdd(int n) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static int sumArray(int[] arr) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static int countVowels(String str) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static double celsiusToFahrenheit(double celsius) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
