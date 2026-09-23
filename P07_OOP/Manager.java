package P07_OOP;

public class Manager extends Employee {
    String department;
    Manager(String name, int age, int empid, double salary, String department){
        super(name,age,empid,salary);
        this.department = department;
    }
    void displayManager(){
        displayPerson();
        displayEmployee();
        System.out.println("Department " + this.department);
    }
    void approveLeave(){
        System.out.println("Leave Approved");
    }
}
