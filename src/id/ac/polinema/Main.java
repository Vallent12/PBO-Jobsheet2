package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("Nadia", 500000);
        acc.withdraw(150000);
        acc.printInfo();
    }
}
