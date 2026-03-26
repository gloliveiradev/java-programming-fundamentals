package View;

import java.util.Scanner;
import Models.Course;

/**
 * Defines the class App for this project.
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Course course = null;
		int opMenu = 0;
		
		showDatabases();
		int op = scanner.nextInt();
		scanner.nextLine();
		
		do {
			if(opMenu == 3)
			{
			op = scanner.nextInt();
				scanner.nextLine();
			}
			
			showOperations(op);
			opMenu = scanner.nextInt();
			scanner.nextLine();
			
			switch(opMenu) {
				
				case 1:
					System.out.print("Course : ");
					String name = scanner.nextLine();
					System.out.print("Description : ");
					String description = scanner.nextLine();
					System.out.print("Workload hours : ");
					int workloadHours = scanner.nextInt();
					chooseTargetAudience();
					int targetAudienceOption = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Price : ");
					float price = scanner.nextFloat();
					scanner.nextLine();
					course = new Course(name, workloadHours, price, description, targetAudienceOption, op);
					course.register(course);
					System.out.println(name + " registered successfully...");
					break;
					
				case 2:
					Course courseList = new Course(op);
					for (Course item : courseList.listCourses()) {
						listCourses(item);
					}
					break;
					
				case 3:
					showDatabases();
					break;
			}
		} while(op != 4);  
		scanner.close();
	}
	
	static void showDatabases() {
		System.out.println("Select the database to use: ");
		System.out.println("1 - MySql");
		System.out.println("2 - SqlServer");
		System.out.print("Option : ");
	}
	
	static void showOperations(int op) {
		if (op == 1) 
			System.out.println("You selected MySql");
		else
			System.out.println("You selected SqlServer");
		System.out.println("Choose an operation:");
		System.out.println("1 - Insert a new course: ");
		System.out.println("2 - View registered courses: ");
		System.out.println("3 - Change database");
		System.out.print("Option : ");
	}
	
	static void chooseTargetAudience() {
		System.out.println("Target audience:");
		System.out.println("1 - Child");
		System.out.println("2 - Teen ");
		System.out.println("3 - Adult");
		System.out.println("4 - Elderly");
		System.out.print("Option : ");
	}
	
	/**
	 * @param course
	 */
	static void listCourses(Course course) {
		String targetAudience = listTargetAudience(course.getTargetAudienceId());
		System.out.println("CourseName : " + course.getName() + " /Description : " + course.getDescription() + " /Price : " + course.getPrice() +
				" /TargetAudience : " + targetAudience + " /WorkloadHours : " + course.getWorkloadHours() );
	}
	
	static String listTargetAudience(int id) {
		switch (id) {
		case 1:
			return "Child";
		case 2:
			return "Teen";
		case 3:
			return "Adult";
		case 4:
			return "Elderly";
		default:
			return"Unexpected value: " + id;
		}
	}
}
