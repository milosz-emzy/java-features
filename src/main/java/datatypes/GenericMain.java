package datatypes;

import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Meow");
        Cat cat1 = new Cat("Meow");
        Dog dog = new Dog("Whoow");

        //przed nadpisaniem equals i hash było false
        System.out.println(cat.equals(cat1)); //true
        GenericPrinter<Cat> genericPrinter = new GenericPrinter<>(cat);
        GenericPrinter<Dog> genericPrinterDog = new GenericPrinter<>(dog);

        genericPrinter.print(cat);
        genericPrinterDog.print(dog);

        System.out.println();
        genericMethod("string in generic method", 10);
        genericMethod(10, 10);
        genericMethod(20L, cat);

        List<String> strings = List.of("one", "two", "three");
        printWildcardList(strings);

        List<Cat> cats = List.of(new Cat("cat-one"), new Cat("cat-two"));
        printWildcardList(cats);

        printWildcardList(List.of(1, "2", cat));
    }

    private static <T, K> void genericMethod(T t, K k) {
        System.out.println(t);
        System.out.println("K class is: " + k.getClass() + "\tvalue: " + k);
        System.out.println("-------");
    }

    private static void printWildcardList(List<?> wildcardList) {
        System.out.println("-------");
        System.out.println(wildcardList);
        System.out.println("-------");
    }
}
