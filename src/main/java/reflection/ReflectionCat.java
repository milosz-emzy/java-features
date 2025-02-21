package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionCat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Cat cat = new Cat("cat-name");

        System.out.println(cat.getName());
        Field name = cat.getClass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(cat, "reflection cat");
        System.out.println(cat.getName());

        Method privateMethod = cat.getClass().getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(cat);

        Method privateStaticMethod = cat.getClass().getDeclaredMethod("privateStaticMethod");
        privateStaticMethod.setAccessible(true);
        privateStaticMethod.invoke(cat);

        try {
            cat.getClass().getDeclaredField("name").setAccessible(true);
            cat.getClass().getDeclaredField("name").set(cat, "reflection cat");
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException has been thrown");
        }
    }
}