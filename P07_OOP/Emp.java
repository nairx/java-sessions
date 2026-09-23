package P07_OOP;

abstract class Emp {
    int empid;
    String name;
    Emp(int empid, String name){
        this.empid = empid;
        this.name = name;
    }
    void login(){
        System.out.println(this.name + " logged into the system");
    }
    abstract double calculateSalary();
}
