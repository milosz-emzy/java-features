package datatypes;

/*
* This is POJO - plain old java object, because POJO:
* 1. Can't extend anything
* 2. Can't implement anything
* 3. No outside annotations - for example @Entity
*/
public class Person {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

/*
* Java bean is:
* To be a Java bean:
* 1. No-args constructor
* 2. Properties must be private
* 3. Public getters and setters
* 4. Must be serializable
* */