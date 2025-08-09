package Lab3;

public class Lab3_2 {
    public static void main(String[] args) {
        try {
            PersonLab3_2 p1 = new PersonLab3_2("John", "Smith", 22);
            AccountLab3_2 a1 = new AccountLab3_2("Sm1234", 10000, p1);

            PersonLab3_2 p2 = new PersonLab3_2("Kathy", "Brown", 24);
            AccountLab3_2 a2 = new AccountLab3_2("Kathy1234", 50000, p2);

            a1.setBalance(1500);
            a2.withdraw(100);

            System.out.println(a1.getAccNum() + " Account has Balance : " + a1.getBalance());
            System.out.println(a2.getAccNum() + " Account has Balance : " + a2.getBalance());
            System.out.println();
            System.out.println(a1);
            System.out.println(a2);

        } catch (AgeValidationException | NameValidationException e) {
            System.err.println("Validation Error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
