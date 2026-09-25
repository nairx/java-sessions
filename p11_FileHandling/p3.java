package p11_FileHandling;
import java.io.*;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        try{
            File file = new File("Students.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String row = sc.nextLine();
                System.out.println(row);
            }
            sc.close();
        }
        catch(IOException e){
            System.out.println("File Error");
        }
    }
}
