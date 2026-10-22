package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Aditya", "0812-0000-0005");
        BusinessAccount business = new BusinessAccount("A005", customer, 2000000, 15000);

        boolean result = business.withdraw(1500000);
        System.out.println("Withdraw 1500000 allowed? " + result);
        
        business.printInfo();
    }
}