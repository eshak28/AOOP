public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating accounts
        BankAccount acc1 = new BankAccount("123", "John Doe", 500.0);
        BankAccount acc2 = new BankAccount("456", "Jane Smith", 1000.0);
        BankAccount acc3 = new BankAccount("789", "Bob Brown", 750.0);

        // Adding accounts to the bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        // Deposit and Withdraw
        bank.deposit("123", 200);
        bank.withdraw("456", 300);

        // Display all accounts
        bank.displayAllAccounts();

        // Find an account by account number
        BankAccount foundAccount = bank.findAccountByNumber("789");
        if (foundAccount != null) {
            System.out.println("Found account: " + foundAccount);
        } else {
            System.out.println("Account not found.");
        }
    }
}
