package encapsulation;


class Dog extends ProtectedAnimal {

    public static void main(String[] args) {
        DefaultAnimal defaultAnimal = new DefaultAnimal();
        ProtectedAnimal protectedAnimal = new ProtectedAnimal();

        Dog dog = new Dog();

        System.out.println(defaultAnimal.age);
        System.out.println(protectedAnimal.age);
        System.out.println(dog.age);
    }
}
