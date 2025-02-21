package upcasting;

class Dog extends Animal{
    @Override
    void makeNoise() {
        System.out.println("Dog barks woof woof...");
    }

    void doDogStuff() {
        System.out.println("dog stuff");
    }
}
