package org.examples;

public class DecrementDemo {
    public static void main(String[] args) {
        int a = 5;
     //4    Pre-decrement: a is decremented to 4, then b is assigned the value 4.
        System.out.println(" b: " + --a);  // Output: a: 4, b: 4
        System.out.println(" b: " + --a);  // Output: a: 4, b: 4

        int c = 5;
        //5 Post-decrement: d is assigned the value 5, then c is decremented to 4.
        System.out.println(" d: " + c--);  // Output: c: 4, d: 5
        System.out.println(" d: " + c--);  // Output: c: 4, d: 5
    }
}
