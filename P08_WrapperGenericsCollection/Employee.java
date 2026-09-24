package P08_WrapperGenericsCollection;

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee other){
        // return this.id - other.id;  //ascending
        // return other.id - this.id;  //desceding
        // return Integer.compare(this.id,other.id);
        // return this.name.compareTo(other.name);
         return this.name.compareToIgnoreCase(other.name);
    }

    public String toString(){
        return this.id + "-" + this.name;
    }

}
