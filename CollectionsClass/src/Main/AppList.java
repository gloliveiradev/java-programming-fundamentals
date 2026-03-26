package Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines the class AppList for this project.
 */
public class AppList {

	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();
		
		for(int i = 0; i< 5; i++) {
			items.add(i + " item");
		}
		
		System.out.println(items.get(0));
		items.remove(0);
		
		for (String item : items) {
			System.out.println(item);
		}
		
		System.out.println(items.size());
	}
}
