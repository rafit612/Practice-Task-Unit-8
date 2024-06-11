package org.examples;

public class TestPrivate {
    public static void main(String[] args) {
        PrivateClass obj = new PrivateClass();
        // obj.privateField = 10;  // Error: privateField has private access in PrivateClass
        // obj.privateMethod();    // Error: privateMethod() has private access in PrivateClass
        obj.accessPrivateMembers();  // Indirect access via public method
    }
}
