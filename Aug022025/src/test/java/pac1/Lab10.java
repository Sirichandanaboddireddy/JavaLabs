package pac1;

public class Lab10 {

    public static boolean isPositiveString(String str) {
        
        str = str.toUpperCase();

        
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false; 
            }
        }
        return true; 
    }
}
