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
    }
}
