import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer parsa = new RegularCustomer("Parsa");
        RegularCustomer sara = new RegularCustomer("Sara");
        PremiumCustomer mamad = new PremiumCustomer("Mamad");

        CreditCardPayment creditCard = new CreditCardPayment("1234 5678 9101 1121", "AmirParsa Rouhani");
        PayPalPayment payPal = new PayPalPayment("sara.ro@gmail.com");
        BitcoinPayment bitcoin = new BitcoinPayment("gq2f3XVXmMRVORkDFFrblfZz8hEIsw");

        parsa.displayCustomerInfo();
        sara.displayCustomerInfo();
        mamad.displayCustomerInfo();

        parsa.makePayment(creditCard, 200000);
        parsa.makePayment(creditCard, 150000);
        sara.makePayment(payPal, 30);
        sara.makePayment(payPal, 50);
        mamad.makePayment(bitcoin, 0.0004);
        mamad.makePayment(bitcoin, 0.00065);

        parsa.showPaymentHistory();
        sara.showPaymentHistory();
        mamad.showPaymentHistory();
    }
}