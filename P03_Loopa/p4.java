package P03_Loopa;

public class p4 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 5) {
            counter++;
            if (counter == 3) {
                continue;
            }
            System.out.println(counter);
        }
    }
}
