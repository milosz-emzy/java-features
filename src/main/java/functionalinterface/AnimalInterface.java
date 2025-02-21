package functionalinterface;

@FunctionalInterface
public interface AnimalInterface {
    default void defaultEat() {
        System.out.println("AnimalInterface defaultEat");
    }

    default void defEat() {
        System.out.println("AnimalInterface defEat");
    }

    void eat();
}
