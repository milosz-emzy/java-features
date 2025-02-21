package polymorphism;

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

    void checkSuper() {
        super.eat();
    }
}
