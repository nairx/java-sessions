package P07_OOP;

public class Developer extends Employee {
    String skill;

    Developer(String name, int age, int empid, double salary, String skill) {
        super(name, age, empid, salary);
        this.skill = skill;
    }

    void displayDeveloper() {
        displayPerson();
        displayEmployee();
        System.out.println("Skill " + this.skill);
    }
}
