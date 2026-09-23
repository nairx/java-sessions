package P07_OOP;

interface Payment {
    void pay(double amount);

    void refund(double amount);

    static void printReceipt() {
        System.out.println("Receipt printed successfully");
    }

    // default void printReceipt() {
    //     System.out.println("Receipt printed successfully");
    // }
}
