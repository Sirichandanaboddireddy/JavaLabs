package pac1;

public class PersonMain {
    public static void main(String[] args) {

        
        Person person = new Person("Siri", "Chandana", 'F');

        System.out.println("Person Details:\n");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Gender: " + person.getGender());
    }
}
