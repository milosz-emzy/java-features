package accessmodifiersprotected;

//'encapsulation. DefaultAnimal' is not public in 'encapsulation'. Cannot be accessed from outside package
//import encapsulation.DefaultAnimal;

import accessmodifiers.ProtectedAnimal;

//'encapsulation. DefaultAnimal' is not public in 'encapsulation'. Cannot be accessed from outside package
//class Dog extends DefaultAnimal {
class Dog extends ProtectedAnimal {

    public static void main(String[] args) {
        // if default modifier then
        // 'age' is not public in 'encapsulation. ProtectedAnimal'. Cannot be accessed from outside package
        //var age = ProtectedAnimal.age;

        //if protected, then no compiler error
        // public class ProtectedAnimal {
        //    protected static int age = 100;
        //}
        var age = ProtectedAnimal.age;
        Dog dog = new Dog();

//        Dog protectedAnimal = new ProtectedAnimal(10, 10);

        //use of protected method via inheritance
        dog.protectedMethod();
    }
}

class AnotherDog {
    public static void main(String[] args) {
        //this class doesn't extend ProtectedAnimal with protected field age
        //'age' has protected access in 'accessmodifiers. ProtectedAnimal'
        //var age = ProtectedAnimal.age;
    }
}
