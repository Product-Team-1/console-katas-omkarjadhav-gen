package com.example.project;

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
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static int sumArray(int[] arr) {
        if (arr == null) return 0;
        int sum = 0;
        for (int v : arr) sum += v;
        return sum;
    }

    public static int countVowels(String str) {
        if (str == null) return 0;
        int count = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
        }
        return count;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
        }

    public static String evenOrOdd(int n) {
        
    }
}
