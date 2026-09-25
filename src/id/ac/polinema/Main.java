package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("nadia", "0812-0000-0001");
        Account accl = new Account("A001", customer1, 500000 );
        accl.withdraw(150000);

        Customer customer2 = new Customer("sari", "0812-0000-0002");
        Account acc2 = new Account("A002", customer2, 200000 );

        Bank bank = new Bank(10);
        bank.addAccount(accl);
        bank.addAccount(acc2);
        bank.printAllAccounts();
        Account found = bank.findAccount("A002");
        if (found != null) {
            found.printInfo();
        }
    }
}