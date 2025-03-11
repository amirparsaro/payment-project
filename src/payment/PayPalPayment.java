package payment;

public class PayPalPayment implements PaymentStrategy {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        // paying :)
    }

    public String getPaymentDetails() {
        return "Payment Strategy: PayPal Payment\nEmail: " + this.email;
    }
}
