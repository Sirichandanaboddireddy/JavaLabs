package Lab3;

public class PersonLab3_2 {
    private String firstName;
    private String lastName;
    private float age;

    public PersonLab3_2(String firstName, String lastName, float age) 
            throws AgeValidationException, NameValidationException {

        if (firstName == null || firstName.trim().isEmpty() ||
            lastName == null || lastName.trim().isEmpty()) {
            throw new NameValidationException("First name and Last name must not be blank");
        }

        if (age <= 15) {
            throw new AgeValidationException("Age of a person should be above 15");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public float getAge() {
        return age;
    }
}
