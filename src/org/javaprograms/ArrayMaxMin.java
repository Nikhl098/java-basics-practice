package org.javaprograms;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] marks = {56, 78, 91, 34, 67};
        int max = marks[0];
        int min = marks[0];
        int sum = 0;
        for (int m : marks) {
            if (m > max) max = m;
            if (m < min) min = m;
            sum += m;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + (double) sum / marks.length);
    }
}
