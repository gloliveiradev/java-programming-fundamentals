package heranca.simuladorpatos;

/**
 * Defines the class Main for this project.
 */
public class Main {

	
	public String getDuckType (Duck p) {
		
		if (p instanceof WildDuck) {	
			return "Wild duck";
		} else {
			if (p instanceof RedHeadDuck) {
				return "Red-head duck";
			} else {
				if (p instanceof WoodenDuck)
				return "Wooden duck";
			}
			return "Generic duck";
		}
		
	}
	
	public static void main (String[] args) {
		
		Main m = new Main();
		Duck p = new Duck();
		System.out.println(m.getDuckType(p));
		p.makeSound();
		p.display();
		p.fly();
		
		System.out.println("-----------------");
		p = new WildDuck();
		System.out.println(m.getDuckType(p));
		p.makeSound();
		p.display();
		p.fly();
		
		System.out.println("-----------------");
		p = new WoodenDuck();
		System.out.println(m.getDuckType(p));
		p.display();
		p.fly();
		
	}
	
}
