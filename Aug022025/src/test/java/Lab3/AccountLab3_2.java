package Lab3;

public class AccountLab3_2 {
    private String accNum;
    private double bal;
    private PersonLab3_2 accHolder;

    public AccountLab3_2(String accNum, double bal, PersonLab3_2 accHolder) {
        if (accHolder == null) {
            throw new NullPointerException("Account holder cannot be null");
        }
        this.accNum = accNum;
        this.bal = bal;
        this.accHolder = accHolder;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return bal;
    }

    public void setBalance(double bal) {
        this.bal = bal;
    }

    public void deposit(double amount) {
        bal += amount;
    }

    @Override
    public String toString() {
        return "Account Number: " + accNum +
               "\nBalance: " + bal +
               "\nAccount Holder: " + accHolder.getName();
    }

    @Override
    public boolean equals(Object obj) { 
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AccountLab3_2 other = (AccountLab3_2) obj;
        return accNum.equals(other.accNum);
    }

    public boolean withdraw(double amount) {
        if (amount < (bal - 500)) {
            bal -= amount;
            return true;
        }
        return false;
    }
}
