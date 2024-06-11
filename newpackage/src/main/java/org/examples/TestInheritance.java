package org.examples;

class ParentClass {
    // Fields
    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field";  // package-private
    private String privateField = "Private Field";  // Not accessible in child

    // Methods
    public void publicMethod() {
        System.out.println("Public method in ParentClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in ParentClass");
    }

    void defaultMethod() {
        System.out.println("Default method in ParentClass");
    }

    private void privateMethod() {
        System.out.println("Private method in ParentClass");  // Not accessible in child
    }
    public ParentClass() {
        System.out.println("ParentClass default constructor");
    }

    // Parameterized constructor
    public ParentClass(String message) {
        System.out.println("ParentClass parameterized constructor: " + message);
    }

    public void display() {
        System.out.println("Display method in ParentClass");
    }
}

class ChildClass extends ParentClass {
    public void showFields() {
        // Accessing inherited fields
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(defaultField);
        // System.out.println(privateField); // Error: privateField has private access in ParentClass
    }
    public ChildClass() {
            super();  // Calls the parent class default constructor
            System.out.println("ChildClass default constructor");
        }

    // Parameterized constructor
    public ChildClass(String message) {
        super(message);  // Calls the parent class parameterized constructor
        System.out.println("ChildClass parameterized constructor: " + message);
    }

    @Override
    public void display() {
        System.out.println("Display method in ChildClass");
    }


    public void callMethods() {
        // Accessing inherited methods
        publicMethod();
        protectedMethod();
        defaultMethod();
        // privateMethod(); // Error: privateMethod() has private access in ParentClass
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.showFields();
        child.callMethods();

        ChildClass child1 = new ChildClass();
        ChildClass child2 = new ChildClass("Hello from Child");

        ParentClass parent = new ParentClass();
        parent.display();  // Output: Display method in ParentClass

        ChildClass child3 = new ChildClass();
        child3.display();  // Output: Display method in ChildClass

        ParentClass parentReference = new ChildClass();
        parentReference.display();  // Output: Display method in ChildClass
    }
}

