package P06_Package.college;

public class Course {
    public void display() {
        System.out.println("Course class");
        Student student = new Student();
        student.display();
        Teacher teacher = new Teacher();
        teacher.display();
    }
}
