package org.examples;

public class TestPublic {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        obj.publicField = 10;  // Accessible
        obj.publicMethod();    // Accessible
    }
}
