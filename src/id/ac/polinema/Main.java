package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("nadia", "0812-0000-0001");
        Customer customer2 = new Customer("sari", "0812-0000-0002");

        Account acc1 = new Account("A001", customer1, 350000);
        Account acc2 = new Account("A002", customer2, 200000);
        Account acc3 = new Account("A003", customer1, 1000000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        System.out.println("--- Daftar Seluruh Rekening ---");
        bank.printAllAccounts();

       System.out.println("\n--- Hasil Pencarian Rekening Nadia ---");
        Account[] nadiaAccounts = bank.findAccountsByOwnerName("nadia");
        System.out.println("Jumlah rekening ditemukan: " + nadiaAccounts.length);
        for (Account acc : nadiaAccounts) {
            acc.printInfo();

        }
    }
}