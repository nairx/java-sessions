package P07_OOP;

public class CreditCardPayment implements Payment, Messaging {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to credit card");
    }

    public  void sendMessage(String msg){
        System.out.println(msg);
    }
}
