package org.examples;

public class TestProtected {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        obj.protectedField = 10;  // Accessible within the same package
        obj.protectedMethod();    // Accessible within the same package
    }
}
