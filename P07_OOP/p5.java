package P07_OOP;

public class p5 {
    public static void main(String[] args) {
        Emp emp = new FullTimeEmp(1001,"Mike", 5000, 1000);
        emp.login();
        System.out.println(emp.calculateSalary());
    }
}
