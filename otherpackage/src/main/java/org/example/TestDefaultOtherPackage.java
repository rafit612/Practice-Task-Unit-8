package org.example;

import org.examples.DefaultClass;
public class TestDefaultOtherPackage {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();  // Not accessible outside the package
        obj.defaultField = 10;  // Error
        obj.defaultMethod();    // Error
    }
}
