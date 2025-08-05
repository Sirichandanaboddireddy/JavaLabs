package pac1;

import java.time.LocalDate;
import java.time.Period;

public class Lab15 {
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dateOfBirth;

    
    public Lab15(String firstName, String lastName, char gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

   
    public int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    
    public void displayPersonDetails() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Age: " + calculateAge());
    }
}
