package P07_OOP;

public class Calc {
    int result;

    Calc(int a, int b) {
        result = a + b;
    }

    Calc(int a, int b, int c) {
        result = a + b + c;
    }

    void displayResult() {
        System.out.println(result);
    }
}
