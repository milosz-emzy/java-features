package immutableclass;

import java.util.List;
import java.util.Map;
import java.util.Set;

// must be final in order to not extend by it
final class ImmutableAnimal {
    private final Integer age;
    private final String name;
    private final List<String> favoriteFood;
    private final Set<String> drinks;
    private final Animal animal;
    private final Map<String, String> map;


    @Override
    public String toString() {
        return "ImmutableAnimal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", favoriteFood=" + favoriteFood +
                ", drinks=" + drinks +
                ", animal=" + animal +
                ", map=" + map +
                '}';
    }

    //make sure that Animal is immutable class
    ImmutableAnimal(Integer age, String name, List<String> favoriteFood, Set<String> drinks, Animal animal, Map<String, String> map) {
        this.age = age;
        this.name = name;
        this.favoriteFood = List.copyOf(favoriteFood);
        this.drinks = Set.copyOf(drinks);
        this.animal = animal;
        this.map = Map.copyOf(map);
    }

    Integer getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Map<String, String> getMap() {
        return map;
    }

    List<String> getFavoriteFood() {
        return List.copyOf(favoriteFood);
    }

    //it works fine, because it is handled in constructor by .copyOf
    List<String> getWrongImmutableFavoriteFood() {
        return favoriteFood;
    }

    Set<String> getDrinks() {
        return drinks;
    }

}
