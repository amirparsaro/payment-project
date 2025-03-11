package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String paymentDetails = "Paid Amount: " + amount + "\n" +
                paymentStrategy.getPaymentDetails();
        paymentHistory.add(paymentDetails);
    }

    public void showPaymentHistory() {
        System.out.println("Showing payment history for: " + this.name);
        for (String paymentDetails : paymentHistory) {
            System.out.print(paymentDetails);
            System.out.println();
            System.out.println("-----------------------------------------------");
        }
        System.out.println();
    }
}