package P08_WrapperGenericsCollection;

public class p2 {
    public static void main(String[] args) {
        int num = 10;  //Primitive type
        Integer number = num;
        System.out.println(number); //Autoboxing (primitive to object)
        int value = number;
        System.out.println(value); //Unboxing (Object to primitive)


    }
}
