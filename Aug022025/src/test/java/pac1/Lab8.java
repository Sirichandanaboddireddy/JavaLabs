package pac1;

public class Lab8 {

    
    public enum Gender {
        M, F
    }

    private String firstName;
    private String lastName;
    private Gender gender;
    private String phoneNumber;

   
    public Lab8() {
        this.firstName = "";
        this.lastName = "";
        this.gender = null;
        this.phoneNumber = "";
    }

    
    public Lab8(String firstName, String lastName, Gender gender, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    
    public void setDetails(String firstName, String lastName, Gender gender, String phoneNumber) {
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

    public Gender getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
