package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Defines the class AppExMap for this project.
 */
public class AppExMap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> phoneBook = new HashMap<>();
		
		System.out.println("Quantity de entry : ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < quantity; i++) 
		{
			System.out.print("Enter the name: ");
			String name = scanner.nextLine();
			System.out.print("Enter the number: ");
			int number = scanner.nextInt();
			scanner.nextLine();
			
			phoneBook.put(name, number);
		}
		
		for (int j = 0; j < quantity; j++) {
			System.out.print("Search by name: ");
			String consultName = scanner.nextLine();
			
			if (phoneBook.containsKey(consultName))
				System.out.println(consultName + " : " + phoneBook.get(consultName));
			else 
				System.out.println("Not found !");
		}
		
		scanner.close();

	}

}
