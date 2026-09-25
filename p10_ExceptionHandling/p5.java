package p10_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class p5 {

    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
        finally{
            file.close();
        }

    }
}
