package oop.polymorphism;

//polymorphism - we are doing the same thing in different form
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.eat(); //Animal is eating...
        cat.eat(); // Cat is eating...
        dog.eat(); // Dog is eating...

        Animal dogAnimal = new Dog();
        dog.eat(); // Dog is eating...
        dogAnimal.eat(); // Dog is eating...

        //dogAnimal.bark(); //Cannot resolve method 'bark' in 'Animal'
        dog.bark(); // bark!
        dog.checkSuper(); // //Animal is eating...

        System.out.println(cat.meow()); //return string meow

        animal.eatViolatesDependencyInversion(); //I'm eating...
        dog.eatViolatesDependencyInversion(); //Dog violates dependency inversion principle
        cat.eatViolatesDependencyInversion(); //I'm eating...

    }
}
