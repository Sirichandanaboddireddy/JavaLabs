package pac1;

public class Lab9 {

    public static String performOperation(String input, int choice) {
        String result = "";

        switch (choice) {
            case 1:
                
                result = input + input;
                break;

            case 2:
                
                for (int i = 0; i < input.length(); i++) {
                    if (i % 2 == 0) {
                        result += input.charAt(i);
                    } else {
                        result += "#";
                    }
                }
                break;

            case 3:
                
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (result.indexOf(ch) == -1) {
                        result += ch;
                    }
                }
                break;

            case 4:
                
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (i % 2 == 1) {
                        result += Character.toUpperCase(ch);
                    } else {
                        result += ch;
                    }
                }
                break;

            default:
                result = "Invalid choice!";
        }

        return result;
    }
}
