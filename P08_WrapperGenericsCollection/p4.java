package P08_WrapperGenericsCollection;

import java.util.ArrayList;

public class p4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.toString());

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Cathy");
        System.out.println(names.toString());

        Printer<String> printer = new Printer<>();
        printer.print("John");

        Printer<Integer> printer1 = new Printer<>();
        printer1.print(12);

    }
}
