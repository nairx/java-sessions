package p11_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class p2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("students.txt",true);
            fileWriter.write("Second Line\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

    }
}
