package pac1;

public class Lab7Main {
    public static void main(String[] args) {
        
        
        Lab7 person1 = new Lab7("Siri", "Chandana", 'F', "123456789");
        person1.displayDetails();

        System.out.println();
        
        Lab7 person2 = new Lab7();
        person2.setDetails("Roshan", "Reddy", 'M', "987654321");
        person2.displayDetails();
    }
}
