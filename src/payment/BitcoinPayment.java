package payment;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void pay(double amount) {
        // paying :)
    }

    public String getPaymentDetails() {
        return "Payment Strategy: Bitcoin Payment\nWallet Address: " + this.walletAddress;
    }
}
