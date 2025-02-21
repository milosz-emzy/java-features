package datatypes;

public class StringsEquals {
    void testCharacterReplacement0() {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = new String("hello");
        // s1 will be in SCP (String constant pool), s2 new in heap, s3 pointing to s1, s4 new in heap

        System.out.println(s1 == s2); //false
        System.out.println(s1.intern() == s2.intern()); //true
        System.out.println(s1 == s3); //true
        System.out.println(s2 == s4); //false

        final int a = 10;
        int b = a;
        b++;
        System.out.println(b);

        Integer aInteger = 127, bInteger = 127;
        Integer aInteger128 = 128, bInteger128 = 128;
        boolean isWhat = aInteger == bInteger; //127 true
        boolean isWhat128 = aInteger128 == bInteger128; //128 false
        System.out.println("aInteger == bInteger is: " + isWhat);
        System.out.println("aInteger128 == bInteger128 is: " + isWhat128);
        //aInteger == bInteger is: false
        // Integer objects outside the range -128 to 127 are not cached, so == compares different objects.


//        System.out.println(xd);
//        Assertions.assertThat(characterReplacement(s, 2)).isEqualTo(4);
    }

}
