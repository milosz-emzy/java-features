package functionalinterface;

//Enum can implements interface
public enum AnimalEnum implements AnimalInterface{
    SHARK("shark");

    private final String name;

    AnimalEnum(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating...");
    }
}
