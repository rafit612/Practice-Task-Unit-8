package org.examples;
abstract class Animalss {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("This animal is eating");
    }

    // Constructor
    public Animalss() {
        System.out.println("An animal is created");
    }
}
public class Sheep extends Animalss {
    // Implementing abstract method
    @Override
    public void makeSound() {
        System.out.println("BAAAAA");
    }

}

class imp{

    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        sheep.makeSound();
        sheep.eat();

    }
}
