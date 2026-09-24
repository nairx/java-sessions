package P08_WrapperGenericsCollection;

import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);
    }
}
