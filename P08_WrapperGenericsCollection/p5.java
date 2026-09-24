package P08_WrapperGenericsCollection;

import java.util.*;

public class p5 {
    public static void main(String[] args) {
        // List<String> names = new ArrayList<>();
        // names.add("John");
        // names.add("Cathy");
        // names.add("Amy");


        List<String> names = List.of("John","Amy","Cathy");

        // for(String name:names){
        //     System.out.println(name);
        // }

        System.out.println(names.size());

        System.out.println(names.get(0));


    }
}
