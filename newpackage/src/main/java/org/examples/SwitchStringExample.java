package org.examples;

public class SwitchStringExample {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Fruit is Apple");
                break;
            case "Banana":
                System.out.println("Fruit is Banana");
                break;
            case "Cherry":
                System.out.println("Fruit is Cherry");
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }
    }
}

