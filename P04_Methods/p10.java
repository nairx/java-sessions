package P04_Methods;

public class p10 {
    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;

    }

    public static void main(String[] args) {
        int result = add(4, 5,1);
        System.out.println(result);
    }
}
