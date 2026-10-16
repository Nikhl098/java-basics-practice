package org.javaprograms;

public class PalindromeCheck {
    static boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replace(" ", "");
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static void main(String[] args) {
        String[] words = {"madam", "Never odd or even", "testing"};
        for (String w : words) {
            System.out.println("\"" + w + "\" palindrome? " + isPalindrome(w));
        }
    }
}
