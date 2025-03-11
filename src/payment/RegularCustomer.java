package payment;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name) {
        super(name);
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Info:");
        System.out.println("Name: " + name + " | Type: " + "Regular");
        System.out.println();
    }
}
