package org.examples;

class MyClass {
    // Static field
    static int staticField = 10;

    // Static method
    public static void staticMethod() {
        System.out.println("Static method called");
    }
}

public class TestStatic {
    public static void main(String[] args) {
        // Accessing static field using class name
        System.out.println("Static field: " + MyClass.staticField);

        // Changing static field using class name
        MyClass.staticField = 20;
        System.out.println("Updated static field: " + MyClass.staticField);

        // Calling static method using class name
        MyClass.staticMethod();
    }
}
