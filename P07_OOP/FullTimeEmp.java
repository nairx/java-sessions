package P07_OOP;

public class FullTimeEmp extends Emp {
    double monthlySalary;
    double bonus;
    FullTimeEmp(int empid,String name,double monthlySalary, double bonus){
        super(empid,name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    double calculateSalary(){
        return monthlySalary + bonus;
    }
}
