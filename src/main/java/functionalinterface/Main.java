package functionalinterface;

@FunctionalInterface
interface Calculator {
    int calculate(int x);
}
@FunctionalInterface
interface CalculatorMany {
    int calculate(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.defaultEat();
        cat.defEat();
        cat.eat();

        Calculator calculator = s -> s+s;
        Calculator multiply = s -> s*s;
        CalculatorMany manyAdditions = (s1, s2) -> s1 + s2;
        System.out.println(calculator.calculate(5)); //10
        System.out.println(multiply.calculate(5)); //25

        System.out.println(manyAdditions.calculate(20, 30)); //50

        AnimalEnum.SHARK.eat();
    }
}
