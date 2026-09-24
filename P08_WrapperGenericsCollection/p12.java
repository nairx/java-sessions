package P08_WrapperGenericsCollection;

import java.util.*;

public class p12 {
    public static void main(String[] args) {
         List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Amy"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(1, "John"));
        Collections.sort(students,new NameComparator());
        System.out.println(students);
    }
}
