package listremove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listRemoveObject = new ArrayList<>(Arrays.asList(1, 2, 3));
        listRemoveObject.add(4);
        System.out.println(listRemoveObject);
        Integer integerObjectValue1 = Integer.valueOf(1);
        listRemoveObject.remove(integerObjectValue1); // from [1,2,3,4] remove by object of Integer.value(1);
        System.out.println(listRemoveObject); // [2,3,4]


        List<Integer> listRemoveByIndex = new ArrayList<>(Arrays.asList(1, 2, 3));
        listRemoveByIndex.add(4);
        System.out.println(listRemoveByIndex);
        int primitiveIntTypeValue1 = Integer.valueOf(1).intValue();
        listRemoveByIndex.remove(primitiveIntTypeValue1); // from [1,2,3,4] remove by index
        System.out.println(listRemoveByIndex); // [1, 3, 4]
    }
}
