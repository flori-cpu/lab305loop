package lab305loop;

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string/number to check if it is a palindrome:");
        original = in.nextLine();

        // Normalize the input: convert to lowercase and remove non-alphanumeric characters
        String normalizedOriginal = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Create a StringBuilder for reverse
        StringBuilder reverseBuilder = new StringBuilder();

        // Reverse the normalized string
        for (int i = normalizedOriginal.length() - 1; i >= 0; i--) {
            reverseBuilder.append(normalizedOriginal.charAt(i));
        }

        reverse = reverseBuilder.toString();

        // Check if the original normalized string equals the reversed string
        if (normalizedOriginal.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }

        in.close(); // Close the scanner to avoid resource leaks
    }
}
