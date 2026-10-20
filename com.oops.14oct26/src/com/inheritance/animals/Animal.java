package com.inheritance.animals;

public class Animal {
    protected String name;

    // Parent method that all animals can use
    public void eat() {
        System.out.println(name + " is eating food.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping. Zzz...");
    }
}
