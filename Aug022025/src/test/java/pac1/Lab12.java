package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first date (yyyy-mm-dd): ");
        String firstDateStr = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateStr);

        
        System.out.print("Enter the second date (yyyy-mm-dd): ");
        String secondDateStr = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateStr);

        
        if (secondDate.isBefore(firstDate)) {
           
            LocalDate temp = firstDate;
            firstDate = secondDate;
            secondDate = temp;
        }

        
        Period duration = Period.between(firstDate, secondDate);

        
        System.out.println("\nDuration between " + firstDate + " and " + secondDate + ":");
        System.out.println("Years : " + duration.getYears());
        System.out.println("Months: " + duration.getMonths());
        System.out.println("Days  : " + duration.getDays());

        scanner.close();
    }
}

