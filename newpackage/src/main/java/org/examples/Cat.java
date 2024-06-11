package org.examples;
interface Animal1 {
    // Abstract method
    void makeSound();

    // Default method (Java 8+)
    default void eat() {
        System.out.println("This animal is eating");
    }

}
public class Cat implements Animal1 {
    // Implementing abstract method
    @Override
    public void makeSound() {
        System.out.println("MEOW");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        Animal1 animal1 = new Cat();

    }
}
