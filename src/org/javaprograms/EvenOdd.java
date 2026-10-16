package org.javaprograms;

public class EvenOdd {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 0, -3, 20};
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        }
    }
}
