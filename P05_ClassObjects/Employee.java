package P05_ClassObjects;

public class Employee {
    String name;
    int age;
    double salary;

    static String company = "Broadridge";
   
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void showProfile() {
        System.out.println(this.name + "-" + this.age);
    }

    void showSalary() {
        System.out.println("Salary is " + this.salary);
    }

    void showInfo() {
        this.showProfile();
        this.showSalary();
    }

    // static void companyName(){
    //     System.out.println("Broadridge");
    // }
}
