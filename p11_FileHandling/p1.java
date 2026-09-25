package p11_FileHandling;
import java.io.File;
import java.io.IOException;
public class p1 {
    public static void main(String[] args) {
        try{
            File file = new File("students.txt");
            file.createNewFile();
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
