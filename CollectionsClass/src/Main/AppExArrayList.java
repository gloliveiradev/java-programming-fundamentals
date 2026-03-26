package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Defines the class AppExArrayList for this project.
 */
public class AppExArrayList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<List<Integer>> masterList = new ArrayList<>();
		System.out.print("Number of lists: ");
		int rows = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < rows; i++) 
		{
			int valueCount = scanner.nextInt();
			scanner.nextLine();
			List<Integer> list = new ArrayList<>();
			System.out.println("Enter values : ");
			for (int j = 0; j < valueCount; j++) 
			{
				System.out.print("Price : ");
				int price = scanner.nextInt();
				scanner.nextLine();
				list.add(price);
			}
			masterList.add(list);
		}
		
		System.out.print("Number of accesses in the master list: ");
		rows = scanner.nextInt();
		for(int z = 0; z < rows; z++) {
			System.out.print("List index to access: ");
			int listIndex = scanner.nextInt();
			scanner.nextLine();
			System.out.print("List position: ");
			int position = scanner.nextInt();
			scanner.nextLine();
			
			if (listIndex > masterList.size()) {
				System.out.println("Erro!!");
				continue;
			}
			
			if (position > masterList.get(listIndex).size()) {
				System.out.println("Error!!");
				continue;
			}
			
			System.out.println(masterList.get(listIndex).get(position));
		}
		scanner.close();
	}

}
