package Lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Lab3_4 {

	public static void main(String[] args) {
		
		String[] product= {"Laptop", "Mobile", "bike","Car"};
		
		Arrays.sort(product, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(product));
	}

}
