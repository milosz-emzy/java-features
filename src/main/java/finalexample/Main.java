package finalexample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Dog dog = new Dog();

        // final field
        //ERROR: Cannot assign a value to final variable 'dog'
//        dog = new Dog();


        // nie można przypisać nowej wartości, można zadeklarować raz i tyle
        // możemy modyfikować wnętrza, działać na tych obiektach, ale nie można przypisać ponownie
        final List<String> finalList = new ArrayList<>();
        finalList.add("1");
        finalList.add("1");
        finalList.add("1");

        System.out.println(finalList);

        //ERROR: Cannot assign a value to final variable 'finalList'
//        finalList = List.of();
    }
}
