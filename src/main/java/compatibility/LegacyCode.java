package compatibility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode {
    public static void main(String[] args) {
        List list = new ArrayList<>();
    // !  ^^Raw Type is the usage of a generic type that doesn't have any generic parameters
        list.add("abc");
        list.add(1);
        list.add(new Object());


        List<String> strings = list;
        // ^^ assigning raw type to non raw type will cause runtime error


        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            final Object element = iterator.next();
            System.out.println(element);
        }
    }
}
