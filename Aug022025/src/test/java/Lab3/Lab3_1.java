package Lab3;

import pac1.Person;

public class Lab3_1 {
	public static void main(String[] args) {
		try {
			Person p = new Person();
			System.out.println(p);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
