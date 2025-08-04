package pac1;

import java.util.Scanner;

public class Lab9Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

      
        System.out.println("Choose an operation:");
        System.out.println("1. Add the string to itself");
        System.out.println("2. Replace odd positions with #");
        System.out.println("3. Remove duplicate characters");
        System.out.println("4. Change odd characters to uppercase");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        
        String result = Lab9.performOperation(input, choice);
        System.out.println("Result: " + result);

        sc.close();
    }
}
