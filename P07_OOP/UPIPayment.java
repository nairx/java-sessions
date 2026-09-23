package P07_OOP;

public class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " via UPI");
    }
}
