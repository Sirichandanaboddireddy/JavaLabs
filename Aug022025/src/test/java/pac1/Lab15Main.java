package pac1;

import java.time.LocalDate;

public class Lab15Main {
    public static void main(String[] args) {
       
        Lab15 person = new Lab15("Siri", "Chandana", 'F', LocalDate.of(2001, 8, 10));

        
        person.displayPersonDetails();
    }
}
