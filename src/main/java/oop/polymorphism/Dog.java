package oop.polymorphism;

public class Dog extends Animal{

    Dog() {
        super();
    }
    @Override
    void eat() {
        System.out.println("Dog is eating...");
    }

    void bark() {
        System.out.println("bark!");
    }
    //overloading
    void bark(String s) {
        System.out.println("bark!");
    }
    void bark(Integer i) {
        System.out.println("bark!");
    }
    void bark(Integer i, Integer j) {
        System.out.println("bark!");
    }

    void checkSuper() {
        super.eat();
    }
}
