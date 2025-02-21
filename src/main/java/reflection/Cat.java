package reflection;

public class Cat {
    private String name;


    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static void privateStaticMethod() {
        System.out.println("Hello from privateStaticMethod");
    }

    private void privateMethod() {
        System.out.println("Hi from privateMethod.");
    }
}
