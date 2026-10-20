package com.inheritance.animals;

// Inherits from Animal
public class Dog extends Animal {

    // Constructor to set the dog's name
    public Dog(String dogName) {
        this.name = dogName; // Inherited from Animal class
    }

    // Child-specific method (Only dogs can bark)
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    public void see()
    {
    	System.out.println(name + " :  is looking for food");
    }
    
}
 
