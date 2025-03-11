package payment;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String name) {
        super(name);
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Info:");
        System.out.println("Name: " + name + " | Type: " + "Premium");
        System.out.println();
    }
}
