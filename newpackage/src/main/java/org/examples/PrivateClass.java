package org.examples;

public class PrivateClass {
    private int privateField;

    private void privateMethod() {
        System.out.println("Private method");
    }

    public void accessPrivateMembers() {
        privateField = 10;  // Accessible within the same class
        privateMethod();    // Accessible within the same class
    }
}
