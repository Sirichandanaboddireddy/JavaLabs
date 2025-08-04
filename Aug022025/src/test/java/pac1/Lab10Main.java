package pac1;

import java.util.Scanner;

public class Lab10Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

       
        boolean isPositive = Lab10.isPositiveString(input);
        if (isPositive) {
            System.out.println(input + " is a Positive String.");
        } else {
            System.out.println(input + " is NOT a Positive String.");
        }

        sc.close();
    }
}
