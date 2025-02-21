package accessmodifiers;


//can be extended by Default access modifier class
class Dog extends DefaultAnimal {

    public static void main(String[] args) {
        DefaultAnimal defaultAnimal = new DefaultAnimal();

        Dog dog = new Dog();

        System.out.println(defaultAnimal.age);
        System.out.println(defaultAnimal.protectedAge);
        System.out.println(dog.age);
    }
}
