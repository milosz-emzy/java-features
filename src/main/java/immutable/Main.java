package immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        useSetInObjectInImmutableList();
        immutableListShowcase();
        arrayAsList();
        unmodifiableListShowcase();

    }

    private  static void unmodifiableListShowcase() {
        List<Integer> listForUnmodifiableList = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> unmodifiableList = Collections.unmodifiableList(listForUnmodifiableList);
        System.out.println(unmodifiableList); //[1,2,3]

        listForUnmodifiableList.add(4);
        System.out.println(unmodifiableList); //[1,2,3,4]
        try {
            unmodifiableList.add(4);
            unmodifiableList.set(0, 4444444);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException for: Collections.unmodifiableList()");
            System.out.println(e);
        }
    }

    private static void immutableListShowcase() {
        List<Integer> immutableList = List.of(1, 2, 3);
        try {
            // can't add, set, remove
            immutableList.add(1);
            immutableList.remove(1);
            immutableList.set(1, 4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException for: List.of");
            System.out.println(e);
        }

        List<Integer> copyOfImmutableList = List.copyOf(immutableList);
        try {
            copyOfImmutableList.add(4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException for: List.copyOf(immutableList)");
            System.out.println(e);
        }
    }

    private static void useSetInObjectInImmutableList() {
        List<Person> immutableListOfPerson = List.of(
                new Person("firstname-1", "lastname-1"),
                new Person("firstname-2", "lastname-2"),
                new Person("firstname-3", "lastname-3")
        );
        System.out.println(immutableListOfPerson);
        immutableListOfPerson.get(0).setName("changed-firstname");
        System.out.println(immutableListOfPerson);
    }

    private static void arrayAsList() {
        //The list returned by this (Arrays.asList) method is modifiable
        List<Integer> modifiableList = Arrays.asList(1, 2, 3);
        System.out.println(modifiableList); //[1,2,3]
        modifiableList.set(0,1000);
        System.out.println(modifiableList); //[1000, 2, 3]
        try {
            /* The returned list implements the optional Collection methods,
             except those that would change the size of the returned list.
             Those methods leave the list unchanged and throw UnsupportedOperationException.
            * */
            modifiableList.add(1);
            modifiableList.remove(1);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException for: Arrays.asList");
            System.out.println(e);
        }
    }
}
