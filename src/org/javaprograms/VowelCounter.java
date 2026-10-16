package org.javaprograms;

public class VowelCounter {
    public static void main(String[] args) {
        String text = "Software Testing";
        int vowels = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        System.out.println("Text: " + text);
        System.out.println("Vowels: " + vowels);
    }
}
