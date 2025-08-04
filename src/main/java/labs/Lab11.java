package labs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDateStr = scanner.nextLine();

      
        LocalDate inputDate = LocalDate.parse(inputDateStr);
        LocalDate currentDate = LocalDate.now();

       
        Period duration = Period.between(inputDate, currentDate);

      
        System.out.println("\nDuration from " + inputDate + " to " + currentDate + ":");
        System.out.println("Years : " + duration.getYears());
        System.out.println("Months: " + duration.getMonths());
        System.out.println("Days  : " + duration.getDays());

        scanner.close();
    }
}

