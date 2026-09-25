package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("nadia", "0812-0000-0001");
        Account aacl = new Account("A001", customer1, 500000 );
        aacl.withdraw(150000);
        aacl.printInfo();
    }
}