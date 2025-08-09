package pac1;

public class Account {
    private static long accountCounter = 1001;

    private long accNum;
    private double balance;
    private Lab2_1 accHolder;

    public Account(Lab2_1 accHolder, double initialBalance) {
        this.accNum = accountCounter++;
        this.accHolder = accHolder;
        this.balance = Math.max(initialBalance, 500); // Ensure minimum balance
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 500) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed. Ensure minimum balance of INR 500.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public Lab2_1 getAccHolder() {
        return accHolder;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum=" + accNum +
                ", balance=" + balance +
                ", accHolder=" + accHolder +
                '}';
    }
}
