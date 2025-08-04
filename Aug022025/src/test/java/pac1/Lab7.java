package pac1;

public class Lab7 {

    private String firstName;
    private String lastName;
    private char gender;
    private String phoneNumber;

  
    public Lab7() {
        this.firstName = "";
        this.lastName = "";
        this.gender = 'N'; 
        this.phoneNumber = "";
    }

    
    public Lab7(String firstName, String lastName, char gender, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    
    public void setDetails(String firstName, String lastName, char gender, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
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

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

