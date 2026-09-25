package p10_ExceptionHandling;

public class p2 {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
