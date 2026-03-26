package Main;

import java.util.HashSet;
import java.util.Set;

/**
 * Defines the class AppSet for this project.
 */
public class AppSet {

	public static void main(String[] args) {
		Set<String> items = new HashSet<>();
		
		items.add("Item 1");
		items.add("Item 2");
		items.add("Item 1");
		
		
		for (String item : items) {
			System.out.println(item);
		}
	}
}
