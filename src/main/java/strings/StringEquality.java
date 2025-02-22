package strings;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = "string1";
        String s2 = "string1";
        String newString1 = new String("string1");
        String newString2 = new String("string1");

        System.out.println(s1==s2); //true, it points to the same address at SCP - string constant pool
        System.out.println(s1==newString1); //false
        System.out.println(s1==newString2); //false
        System.out.println(newString1==newString2); //false, it checks address
        System.out.println(newString1.intern()==newString2.intern()); //true
        System.out.println(newString1.equals(newString2)); //true

    }
}
