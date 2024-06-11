package org.example;

import org.examples.ProtectedClass;

public class TestProtected extends ProtectedClass {
    public static void main(String[] args) {
        TestProtected obj = new TestProtected();
        obj.protectedField = 10;  // Accessible within the same package
        obj.protectedMethod();    // Accessible within the same package
    }
}
