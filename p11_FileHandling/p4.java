package p11_FileHandling;

import java.io.File;

public class p4 {
    public static void main(String[] args) {
        try {
            File file = new File("Students.txt");
            file.delete();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
