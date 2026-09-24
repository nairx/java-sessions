package P08_WrapperGenericsCollection;

import java.util.*;

public class p10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Cathy");
        names.add("Amy");

        Iterator<String> iterator = names.iterator();

        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        while (iterator.hasNext()) {
            if (iterator.next() == "John") {
                iterator.remove();
            }

        }

        System.out.println(names);

    }
}
