package P04_Methods;

public class p3 {
     static String myMethod(String name) {
        return "Hello " + name;
    }
    public static void main(String[] args) {
        String res = myMethod("John");
        System.out.println(res);
    }
}
