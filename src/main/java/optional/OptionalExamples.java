package optional;

import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {
//        optionalOfNullable();
        optionalOf();


    }

    private static void optionalOf() {
        Optional<String> optional = Optional.of("string");
        String s = optional.get();
        System.out.println(s); //print "string"

        //Optional.of(null) -> NullPointerException – if value is null
        Optional<String> optionalOfNull = Optional.of(null); //NPE
        System.out.println("hehe");
        String s1 = optionalOfNull.get();
        System.out.println(s1);
    }

    /*
    *         Optional<String> optionalOfNull = Optional.of(null); //Optional.of(null) will throw NPE
    *       Optional<String> nullOfNullable = Optional.ofNullable(null); //Optional.ofNullable(null) will create Optional.empty()
    *       nullOfNullable.get() // if (value == null) throw new NoSuchElementException("No value present");
     * */

    private static void optionalOfNullable() {
        Optional<String> valueOfNullable = Optional.ofNullable("value in optional");
        System.out.println(valueOfNullable.get()); // print "value in optional"
        System.out.println();

        //return value == null ? (Optional<T>) EMPTY : new Optional<>(value);
        Optional<String> nullOfNullable = Optional.ofNullable(null);
//        System.out.println(nullOfNullable.get()); //Exception in thread "main" java.util.NoSuchElementException: No value present
//        System.out.println(Optional.empty().get());
        System.out.println();


        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Default")); //print "Default"

        // Optional.ofNullable(null) <=> Optional.of
        Optional<String> optionalOrElseThrow = Optional.ofNullable(null);
//        optionalOrElseThrow.orElseThrow(IllegalArgumentException::new); //will throw a given exception
//        optionalOrElseThrow.orElseThrow(); //will throw a default Exception NoSuchElementException("No value present");
    }


}
