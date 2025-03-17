package datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GenericSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 0));
        System.out.println("Before: " + list);
        sortGeneric(list, Comparator.naturalOrder());
        System.out.println("After sort: " + list);

        List<String> stringList = new ArrayList<>(Arrays.asList("bbb", "aaa", "a", "c"));
        System.out.println("Before: " + stringList);
        sortGeneric(stringList, Comparator.naturalOrder());
        System.out.println("After sort: " + stringList);

    }

    public static <T> void sortGeneric(List<T> list, Comparator<T> comparator) {
        list.sort(comparator);
    }
}
