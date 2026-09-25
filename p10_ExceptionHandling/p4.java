package p10_ExceptionHandling;

public class p4 {
    static void checkAge(int age){
        if  (age < 18){
            throw new ArithmeticException("Not Eligible");
        }
    }
    public static void main(String[] args) {
        checkAge(16);
    }
}
