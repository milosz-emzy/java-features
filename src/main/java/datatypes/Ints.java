package datatypes;

public class Ints {
    public static void main(String[] args) {
        final int a = 10;
        int b = a;
        b++;
        System.out.println(b); //b=11, b can be changed because it's a copy of final a

        int aInteger = 127, bInteger = 127;
        Integer aInteger128 = 128, bInteger128 = 128;
        boolean isWhat = aInteger == bInteger; //127 true
        boolean isWhat128 = aInteger128 == bInteger128; //128 false
        System.out.println("aInteger == bInteger is: " + isWhat); //true
        System.out.println("aInteger128 == bInteger128 is: " + isWhat128); //false
        //aInteger == bInteger is: false
        // Integer objects outside the range -128 to 127 are not cached, so == compares different objects.

    }
}
