package datatypes;

import java.io.Serializable;

class Animal implements Serializable {
    void eat() {
    }

    public <T extends Animal> void eat(T animalType) {
        System.out.println(animalType + " eat eat eat");
    }
}
