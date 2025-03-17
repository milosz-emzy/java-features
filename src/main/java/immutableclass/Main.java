package immutableclass;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> food = new ArrayList<>();
        food.add("meat");
        food.add("ham");

        Set<String> drinks = new HashSet<>();
        drinks.add("water");
        drinks.add("milk");

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Animal simpleAnimal = new Animal("name");
        ImmutableAnimal immutableAnimal = new ImmutableAnimal(
                100_000,
                "tiger",
                food,
                drinks,
                simpleAnimal,
                map
        );

        map.put("another-key", "another-value");
        System.out.println(immutableAnimal.getMap());

        food.add("another-food");
        System.out.println(immutableAnimal.toString());
        System.out.println();

        Integer age = immutableAnimal.getAge();
        age = 5_000_000;

        System.out.println("Age " + age); //5_000_000
        System.out.println("Get age " + immutableAnimal.getAge()); // stays 100000


        food.add("another-food");
        drinks.add("another-drink");

        System.out.println("Changed food list is: " + food);
        System.out.println("Favorite food: " + immutableAnimal.getFavoriteFood());
        System.out.println("Favorite wrong immutable food: " + immutableAnimal.getWrongImmutableFavoriteFood());

        System.out.println("Favorite drinks: " + immutableAnimal.getDrinks());

    }
}
