package labs;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab13 {

    
    public static LocalDate calculateWarrantyExpiry(LocalDate purchaseDate, int years, int months) {
        return purchaseDate.plusYears(years).plusMonths(months);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter purchase date (yyyy-mm-dd): ");
        String purchaseDateStr = scanner.nextLine();
        LocalDate purchaseDate = LocalDate.parse(purchaseDateStr);

       
        System.out.print("Enter warranty period in years: ");
        int warrantyYears = scanner.nextInt();

        System.out.print("Enter warranty period in months: ");
        int warrantyMonths = scanner.nextInt();

        
        LocalDate expiryDate = calculateWarrantyExpiry(purchaseDate, warrantyYears, warrantyMonths);

        
        System.out.println("\nWarranty expires on: " + expiryDate);

        scanner.close();
    }
}
