package org.javaprograms;

public class Factorial {
    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 6; n++) {
            System.out.println(n + "! = " + factorial(n));
        }
    }
}
