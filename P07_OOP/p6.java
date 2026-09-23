package P07_OOP;

public class p6 {
    public static void main(String[] args) {
        CreditCardPayment payment1 = new CreditCardPayment();
        payment1.pay(1000);
        payment1.refund(1000);
        payment1.sendMessage("Welcome");
        Payment.printReceipt();
        Payment payment2 = new UPIPayment();
        payment2.pay(1200);
        payment2.refund(1200);
        Payment.printReceipt();
    }
}
