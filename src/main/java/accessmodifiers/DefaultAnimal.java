package accessmodifiers;

// default, package-private
class DefaultAnimal {
    int age = 100;
    protected int protectedAge = 100;
    static class InnerClass {
        final String name = "";

        static void eatStatic() {
            System.out.println("om om om");
        }
    }

}
