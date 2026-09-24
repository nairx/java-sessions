package P08_WrapperGenericsCollection;

import java.util.*;

public class p8 {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "Amy");
        employees.put(2, "John");
        employees.put(3, "Cathy");
        // System.out.println(employees);
        // System.out.println(employees.get(1));
        for(Integer key:employees.keySet()){
            System.out.println(key + "-" + employees.get(key));
        }
    }
}
