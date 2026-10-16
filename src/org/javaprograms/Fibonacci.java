package org.javaprograms;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int first = 0, second = 1;
        System.out.print("First " + count + " Fibonacci numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
