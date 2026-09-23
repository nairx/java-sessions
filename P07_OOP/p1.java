package P07_OOP;

public class p1 {
    public static void main(String[] args) {
        // Person person = new Person("John", 21);
        // person.displayPerson();

        // Employee employee = new Employee("John", 21,1001,5000);
        // employee.displayPerson();
        // employee.displayEmployee();

        Manager manager = new Manager("John", 35, 1001, 75000, "IT");
        manager.displayManager();
        manager.approveLeave();

        Developer developer = new Developer("Amy",20, 1002, 12000, "Java");
        developer.displayDeveloper();;
    }
}
