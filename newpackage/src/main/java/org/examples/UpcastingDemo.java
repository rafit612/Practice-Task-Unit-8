package org.examples;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Fetch the ball");
    }
}

public class UpcastingDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();
          // Upcasting
        animal.makeSound();  // Output: Bark
        // animal.fetch();  // Error: Cannot find method fetch() in Animal

        Dog dog = (Dog) animal;
        dog.fetch();
    }
}
