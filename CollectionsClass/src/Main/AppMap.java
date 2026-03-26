package Main;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines the class AppMap for this project.
 */
public class AppMap {

	public static void main(String[] args) {
		Map<String, Double> portfolio = new HashMap<>();
		
		portfolio.put("GOLL4", 13.56);
		portfolio.put("PETR4", 22.0);
		portfolio.put("MGLU3", 2.20);
		
		
		System.out.println(portfolio.get("MGLU3"));
		
		for (String key : portfolio.keySet()) {
			System.out.println(key + " : " + portfolio.get(key));
		}
		
		//map works through key-value pairs
		
		Map<String, String> map = new HashMap<>();
        map.put("Name", "Aman");
        map.put("Address", "Kolkata");
  
        // Print the map
        System.out.println("Map: " + map);
  
        // remap the values using compute() method
        map.compute("Name", (key, val)
                                -> val.concat(" Singh"));
        map.compute("Address", (key, val)
                                   -> val.concat(" West-Bengal"));
  
        // print new mapping
        System.out.println("New Map: " + map);
	}

}
