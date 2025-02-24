package abstractclass;

//Class 'Dog' must either be declared abstract or implement abstract method 'eat()' in 'Animal'
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog eat om om");
    }
}
