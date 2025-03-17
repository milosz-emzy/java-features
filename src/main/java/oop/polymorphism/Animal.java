package oop.polymorphism;

public class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void eatViolatesDependencyInversion() {
        if (this instanceof Dog) {
            System.out.println("Dog violates dependency inversion principle");
        } else {
            System.out.println("I'm eating...");
        }
    }

    Object meow() {
        return new Object();
    }
}
