package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("nadia", "0812-0000-0001");
        SavingsAccount acc1 = new SavingsAccount("A001", customer1, 500000, 0.01);
        acc1.withdraw(150000);

        Customer customer2 = new Customer("Sari", "0812-0000-0001");
        CheckingAccount acc2 = new CheckingAccount("A002", customer2, 200000, 50000);
        acc2.withdraw(230000);

        Customer customer3 = new Customer("Aditya", "0812-0000-0003");
        BusinessAccount acc3 = new BusinessAccount("A003", customer3, 2000000, 15000);
        
        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        
        System.out.println("-- Daftar Seluruh Rekening di Bank --");
        bank.printAllAccounts();

        System.out.println("\n-- Detail Type Rekening --");
        acc1.printAccountType();
        acc2.printAccountType();
        acc3.printAccountType();
    }
}