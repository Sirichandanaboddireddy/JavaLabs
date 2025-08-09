package pac1;

public class AccountMain {
    public static void main(String[] args) {

        Lab2_1 smith = new Lab2_1("Smith", 30);
        Lab2_1 kathy = new Lab2_1("Kathy", 28);

        Account smithAcc = new Account(smith, 2000);
        Account kathyAcc = new Account(kathy, 3000);

        smithAcc.deposit(2000);
        kathyAcc.withdraw(2000);

        System.out.println("Updated Balance - Smith: " + smithAcc.getBalance());
        System.out.println("Updated Balance - Kathy: " + kathyAcc.getBalance());

        System.out.println("\n--- Account Details ---");
        System.out.println(smithAcc);
        System.out.println(kathyAcc);
    }
}
