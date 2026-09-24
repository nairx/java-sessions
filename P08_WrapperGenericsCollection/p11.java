package P08_WrapperGenericsCollection;

import java.util.*;

public class p11 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "amy"));
        employees.add(new Employee(3, "Mike"));
        employees.add(new Employee(1, "John"));
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        Collections.sort(employees);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
