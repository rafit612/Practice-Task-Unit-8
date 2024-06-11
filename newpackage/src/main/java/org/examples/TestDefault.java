package org.examples;

public class TestDefault {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        obj.defaultField = 10;  // Accessible within the same package
        obj.defaultMethod();    // Accessible within the same package
    }
}
