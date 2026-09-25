package p10_ExceptionHandling;

public class p3 {
    public static void main(String[] args) {
        try{
            // int[] numbers = {1,2,3};
            // System.out.println(numbers[5]);
            int result = 10/0;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index Error");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic  Error");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
