package org.examples;

class MyClass2 {
    // Non-static field
    int nonStaticField = 10;

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method called");
    }
}

public class TestNonStatic {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass2 obj = new MyClass2();

        // Accessing non-static field using instance
        System.out.println("Non-static field: " + obj.nonStaticField);

        // Changing non-static field using instance
        obj.nonStaticField = 20;
        System.out.println("Updated non-static field: " + obj.nonStaticField);

        // Calling non-static method using instance
        obj.nonStaticMethod();
    }
}

