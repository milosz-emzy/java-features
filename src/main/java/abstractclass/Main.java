package abstractclass;

class Main {
    public static void main(String[] args) {
        //can't create object from abstract class
//        Animal animal = new Animal() {
//            @Override
//            void eat() {
//
//            }
//        };

        //Class 'Anonymous class derived from Animal' must implement abstract method 'eat()' in 'Animal'
        //Animal animal = new Animal() {};

        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
    }
}
