package upcasting;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        //upcasting
        Animal animalUpcasting = new Dog();
        Dog dog = new Dog();

//        //Method of dog instance will be used
//        animalUpcasting.makeNoise();
//
//        //Cannot resolve method 'doDogStuff' in 'Animal'
//        //animal.doDogStuff();
//        dog.doDogStuff();
//
//        animalMakeNoiseUpcast(animal); //Animal noise
//        animalMakeNoiseUpcast(animalUpcasting); //Dog noise
//        animalMakeNoiseUpcast(dog); //Dog noise

        animalMakeNoiseDowncast(animal); //Animal noise
        animalMakeNoiseDowncast(animalUpcasting); //will pass instance of Dog
        animalMakeNoiseDowncast(dog); //will pass instance of Dog
    }

    private static void animalMakeNoiseUpcast(Animal animal) {
        animal.makeNoise();
    }

    private static void animalMakeNoiseDowncast(Animal animal) {
        animal.makeNoise();

        //Possible "main" java.lang.ClassCastException, (which extends RunTimeException)
        //Dog dog = (Dog) animal;
        //dog.doDogStuff();

        //safe new way is to check by instanceof when we want to downcast with downcast to dog
        if (animal instanceof Dog dog) {
            dog.doDogStuff();
        }

        //old way
        //Variable 'dog' can be replaced with pattern variable
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.doDogStuff();
        }
    }
}
