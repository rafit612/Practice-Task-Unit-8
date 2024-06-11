package org.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        // Example 1: Filtering even numbers and collecting to a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Stream API
        List<Integer> evenNumbersStream = numbers.stream()
                .filter(n -> n % 2 == 0) // Intermediate operation
                .collect(Collectors.toList()); // Terminal operation
        System.out.println("Even Numbers (Stream): " + evenNumbersStream); // Output: [2, 4, 6, 8, 10]

        // Using For Loop
        List<Integer> evenNumbersLoop = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbersLoop.add(number);
            }
        }
        System.out.println("Even Numbers (Loop): " + evenNumbersLoop); // Output: [2, 4, 6, 8, 10]

        // Example 2: Mapping strings to their lengths and collecting to a list
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // Using Stream API
        List<Integer> lengthsStream = words.stream()
                .map(String::length) // Intermediate operation
                .collect(Collectors.toList()); // Terminal operation
        System.out.println("Lengths (Stream): " + lengthsStream); // Output: [5, 6, 6, 4]

        // Using For Loop
        List<Integer> lengthsLoop = new ArrayList<>();
        for (String word : words) {
            lengthsLoop.add(word.length());
        }
        System.out.println("Lengths (Loop): " + lengthsLoop); // Output: [5, 6, 6, 4]

        // Example 3: Filtering names starting with 'A', mapping to uppercase, and printing each
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Anna");

        // Using Stream API
        names.stream()
                .filter(name -> name.startsWith("A")) // Intermediate operation
                .map(String::toUpperCase) // Intermediate operation
                .forEach(System.out::println); // Terminal operation
        // Output:
        // ALICE
        // ANNA

        // Using For Loop
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name.toUpperCase());
            }
        }
        // Output:
        // ALICE
        // ANNA

        // Example 4: Combining filter, map, and collect
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        // Using Stream API
        List<String> filteredFruitsStream = fruits.stream()
                .filter(fruit -> fruit.length() > 5) // Intermediate operation
                .map(String::toUpperCase) // Intermediate operation
                .collect(Collectors.toList()); // Terminal operation
        System.out.println("Filtered Fruits (Stream): " + filteredFruitsStream); // Output: [BANANA, CHERRY, ELDERBERRY]

        // Using For Loop
        List<String> filteredFruitsLoop = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.length() > 5) {
                filteredFruitsLoop.add(fruit.toUpperCase());
            }
        }
        System.out.println("Filtered Fruits (Loop): " + filteredFruitsLoop);
    }
}


//Explanation of the Class
//Example 1:
//
//Intermediate Operation: filter(n -> n % 2 == 0) filters even numbers.
//Terminal Operation: collect(Collectors.toList()) collects the filtered numbers into a List.
//        Example 2:
//
//Intermediate Operation: map(String::length) maps each string to its length.
//Terminal Operation: collect(Collectors.toList()) collects the lengths into a List.
//Example 3:
//
//Intermediate Operation: filter(name -> name.startsWith("A")) filters names that start with 'A'.
//Intermediate Operation: map(String::toUpperCase) converts each filtered name to uppercase.
//Terminal Operation: forEach(System.out::println) prints each uppercase name.
//Example 4:
//
//Intermediate Operation: filter(fruit -> fruit.length() > 5) filters fruits with names longer than 5 characters.
//Intermediate Operation: map(String::toUpperCase) converts each filtered fruit name to uppercase.
//Terminal Operation: collect(Collectors.toList()) collects the results into a List.
//These examples demonstrate the use of intermediate and terminal operations in Java's Stream API.
// The collect method is a versatile terminal operation used to transform the processed stream elements into a desired collection type.