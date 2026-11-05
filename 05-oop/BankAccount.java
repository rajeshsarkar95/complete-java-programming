public class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double openingBalance) {
        if (openingBalance < 0) throw new IllegalArgumentException("Negative balance");
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    public double getBalance() { return balance; }
    public String getAccountHolder() { return accountHolder; }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Asha", 1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println(account.getAccountHolder() + ": " + account.getBalance());
    }
}
