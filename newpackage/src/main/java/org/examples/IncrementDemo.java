package org.examples;

public class IncrementDemo {
    public static void main(String[] args) {
        int a = 5;
 // Pre-increment: a is incremented to 6, then b is assigned the value 6.
        System.out.println(" b: " + ++a);  // Output: a: 6, b: 6
        System.out.println(" b: " + ++a);  // Output: a: 6, b: 6
        System.out.println(" b: " + ++a);  // Output: a: 6, b: 6

        int c = 5;// Post-increment: d is assigned the value 5, then c is incremented to 6.
        System.out.println(" d: " + c++);  // Output: c: 6, d: 5
        System.out.println(" d: " + c++);  // Output: c: 6, d: 5
        System.out.println(" d: " + c++);  // Output: c: 6, d: 5
    }
    
}
