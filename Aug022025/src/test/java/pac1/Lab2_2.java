package pac1;


class Account1 {
    protected String accountNumber;
    protected double balance;

    public Account1(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    
    public void withdraw(double amount) {
        balance -= amount;
    }
}


class SavingsAccount extends Account1 {
    private final double minimumBalance = 500.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw! Minimum balance of " + minimumBalance + " must be maintained.");
        }
    }
}


class CurrentAccount extends Account1 {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw! Overdraft limit of " + overdraftLimit + " exceeded.");
        }
    }
}


public class Lab2_2 {
    public static void main(String[] args) {
       
        Account1 acc1 = new SavingsAccount("S123", 1000);
        acc1.displayBalance();
        acc1.withdraw(400);  
        acc1.displayBalance();
        acc1.withdraw(200); 
        acc1.displayBalance();

        System.out.println("---------------------------");

        Account1 acc2 = new CurrentAccount("C456", 1000, 500);
        acc2.displayBalance();
        acc2.withdraw(1300);  
        acc2.displayBalance();
        acc2.withdraw(300);   
        acc2.displayBalance();
    }
}
