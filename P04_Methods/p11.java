package P04_Methods;

public class p11 {
    static void calc(String name,int... marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println(name + "-" + sum);
    }

    public static void main(String[] args) {
        calc("John",4, 5,1);

    }
}
