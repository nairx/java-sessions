package P08_WrapperGenericsCollection;

public class p3 {
    public static void main(String[] args) {
        Printer<String> printer = new Printer<>();
        printer.print("John");
        Printer<Integer> printer1 = new Printer<>();
        printer1.print(10);
    }
}
