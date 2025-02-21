package datatypes;

public record GenericPrinter<T extends Animal>(T animalOfUnknownType) {

    public void print(T animalType) {
        animalOfUnknownType.eat(animalType);
        System.out.println(animalType + " - animal type");
        System.out.println("Value: " + animalOfUnknownType + "\tclass" + animalOfUnknownType.getClass());
        System.out.println();
    }
}


