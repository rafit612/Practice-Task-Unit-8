package org.examples;

class Animals {
    public void makeSound() {
        System.out.println("Animal Makes SOund");
    }
}

class Doggy extends Animals {

    public void makeSound() {
        System.out.println("Bark");
    }


    void fetch() {
        System.out.println("Fetch the ball" );
        super.makeSound();
    }
}

public class DowncastingDemo {
    public static void main(String[] args) {


        Doggy doggy = new Doggy();
        doggy.makeSound();
        doggy.fetch();


        // Downcasting with instanceof check
    }
}
