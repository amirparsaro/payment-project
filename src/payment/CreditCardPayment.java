package payment;

public class CreditCardPayment implements PaymentStrategy {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public void pay(double amount) {
        // paying :)
    }

    public String getPaymentDetails() {
        return "Payment Strategy: Credit Card\nCard number: " + this.cardNumber +
                "\nCard Holder Name: " + this.cardHolderName;
    }
}
