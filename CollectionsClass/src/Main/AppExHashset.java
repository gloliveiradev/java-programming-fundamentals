package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Defines the class AppExHashset for this project.
 */
public class AppExHashset {

	public static void main(String[] args) {
		Set<String> items = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of entries: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < quantity; i++) 
		{
			String entry = scanner.nextLine();
			if (!items.contains(entry))
				items.add(entry);
			
			System.out.println(items.size());
		}
		
		scanner.close();
	}
}
