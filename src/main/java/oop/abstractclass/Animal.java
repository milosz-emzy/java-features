package oop.abstractclass;

abstract class Animal {
    int age;
    String name;

    //Abstract method can't be in non-abstract class
    //Abstract method in non-abstract class
    abstract void eat();

    void eatNoAbstract() {
        if (this instanceof Dog dog) {
            System.out.println("Dog violates dependency inversion principle");
        } else {
            System.out.println("Eat no abstract");
        }
    }
}
