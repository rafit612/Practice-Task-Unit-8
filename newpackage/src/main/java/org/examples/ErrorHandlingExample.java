package org.examples;

public class ErrorHandlingExample {
    public static void main(String[] args) {
        try {
            generateStackOverflowError();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes, even after an error");
        }
    }

    // Method that generates a StackOverflowError
    public static void generateStackOverflowError() {
        generateStackOverflowError(); // Recursive call without termination condition
    }
}
