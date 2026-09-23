package P07_OOP;

public class Employee extends Person {
    int empid;
    double salary;
    Employee(String name, int age,int empid, double salary){
        super(name,age);
        this.empid = empid;
        this.salary=salary;
    }
    void displayEmployee(){
        System.out.println("Employee Id : " + this.empid);
        System.out.println("Salary " + this.salary);
    }
}
