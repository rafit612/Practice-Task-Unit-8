package org.examples;

import java.util.ArrayList;
import java.util.List;

public class LoopExample {
    public static void main(String[] args) {
        // While loop example
        int count = 1;  // Initialize a counter variable

        // Start of the while loop
        while (count <= 5) {
            System.out.println("Count for while is: " + count);  // Print the current value of count
            count++;  // Increment the counter by 1
        }
        System.out.println("");


        int counts = 1;  // Initialize a counter variable

        // Start of the do-while loop
        do {
            System.out.println("Count for do while is: " + counts);  // Print the current value of count
            counts++;  // Increment the counter by 1
        } while (counts <= 5);  // Condition of the do-while loop

        System.out.println("");

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        int index = 0;  // Initialize an index variable
        while (index < fruits.size()) {
            System.out.println("Fruit: " + fruits.get(index));  // Print the current fruit
            index++;  // Increment the index
        }

        String[] fruitss = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        int indexs = 0;  // Initialize an index variable
        while (index < fruitss.length) {
            System.out.println("Fruit: " + fruitss[indexs]);  // Print the current fruit
            index++;  // Increment the index
        }

        System.out.println("");

        List<String> fruitsa = new ArrayList<>();
        fruitsa.add("Apple");
        fruitsa.add("Banana");
        fruitsa.add("Cherry");
        fruitsa.add("Date");
        fruitsa.add("Elderberry");

        int indexa = 0;  // Initialize an index variable
        if (fruitsa.size() > 0) {
            do {
                System.out.println("Fruit: " + fruitsa.get(indexa));  // Print the current fruit
                indexa++;  // Increment the index
            } while (indexa < fruitsa.size());
        }

        System.out.println("");

        String[] fruitsz = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        int indexz = 0;  // Initialize an index variable
        if (fruitsz.length > 0) {
            do {
                System.out.println("Fruit: " + fruitsz[indexz]);  // Print the current fruit
                indexz++;  // Increment the index
            } while (indexz < fruitsz.length);
        }


        System.out.println("");
        List<String> fruitsw = new ArrayList<>();
        fruitsw.add("Apple");
        fruitsw.add("Banana");
        fruitsw.add("Cherry");
        fruitsw.add("Date");
        fruitsw.add("Elderberry");

        // Using for loop to iterate through the list
        for (int i = 0; i < fruitsw.size(); i++) {
            System.out.println("Fruit: " + fruitsw.get(i));  // Print the current fruit
        }

        System.out.println("");
        String[] fruitse = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        // Using for loop to iterate through the array
        for (String s : fruitse) {
            System.out.println("Fruit: " + s);  // Print the current fruit
        }


        System.out.println("");
        // Using for loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);  // Print the current number
        }


        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Exit the loop when i is 5
            }
            System.out.println("Break i: " + i);
        }

        System.out.println();
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                break;  // Exit the loop when i is 5
            }
            System.out.println("break while i: " + i);
            i++;
        }

        System.out.println();
        int a = 1;
        do {
            if (a == 5) {
                break;  // Exit the loop when i is 5
            }
            System.out.println("break do while i: " + a);
            a++;
        } while (a <= 10);

        System.out.println();
        for (int c = 1; c <= 10; c++) {
            if (c % 2 == 0) {
                continue;  // Skip the current iteration when i is even
            }
            System.out.println("continue i: " + c);
        }

        System.out.println();
        int d = 1;
        while (d <= 10) {
            if (d % 2 == 0) {
                d++;
                continue;  // Skip the current iteration when i is even
            }
            System.out.println("i: " + d);
            d++;
        }
    }
}
