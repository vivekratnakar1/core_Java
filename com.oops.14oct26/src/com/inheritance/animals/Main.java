package com.inheritance.animals;

public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy");

        // 1. Call methods inherited from the parent class (Animal)
        myDog.eat();
        myDog.sleep();

        // 2. Call the method belonging strictly to the child class (Dog)
        myDog.bark();
        myDog.see();
    }
}
