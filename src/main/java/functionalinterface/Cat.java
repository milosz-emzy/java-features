package functionalinterface;

public class Cat implements AnimalInterface {
    @Override
    public void defaultEat() {
        System.out.println("overrided defaultEat");
    }

    @Override
    public void eat() {
        System.out.println("proper functional interface eat");
    }
}
