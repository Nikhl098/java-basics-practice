package org.javaprograms;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] data = {10, 20, 30};
        try {
            System.out.println(data[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("finally block always runs");
        }
    }
}
