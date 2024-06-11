package org.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class ComprehensiveExample {

    public static void main(String[] args) {
        try {
            readFile("test.txt");
            divideNumbers(10, 0);
            validateAge(15);
            generateStackOverflowError();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }
    }

    // Method that throws a checked exception (IOException)
    public static void readFile(String filename)   {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


        }catch (IOException e){
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    // Method that throws an unchecked exception (ArithmeticException)
    public static void divideNumbers(int a, int b) {
        int result = a / b; // This will throw ArithmeticException if b is 0
        System.out.println("Result: " + result);
    }

    // Method that throws a custom exception (InvalidAgeException)
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age is valid: " + age);
    }

    // Method that generates a StackOverflowError
    public static void generateStackOverflowError() {
        generateStackOverflowError(); // Recursive call without termination condition
    }
}
