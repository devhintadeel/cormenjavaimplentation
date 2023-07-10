package com.adeelaslam;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorials of first 10 numbers ");
        for (
                int i = 1; i <= 10; i++
        ) {
            System.out.println("Number : " + i + " factorial : " + factorial(i));
        }

    }

    public static int factorial(int n) {
        if (
            n == 0
        ) {
            return 1;
        }
        if (
            n == 1
        ) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
