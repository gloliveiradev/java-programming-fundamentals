package Main;

import java.util.Scanner;

import IOrdenacao.BubbleSortMethod;
import IOrdenacao.InsertionSortMethod;
import IOrdenacao.SelectionSortMethod;
import Models.AdultPatient;
import Models.ChildPatient;
import Models.ElderlyPatient;

/**
 * Defines the class App for this project.
 */
public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BubbleSortMethod mBS = new BubbleSortMethod();
		InsertionSortMethod mIS = new InsertionSortMethod();
		SelectionSortMethod mSS = new SelectionSortMethod();
		
		System.out.print("How many temperature measurements were taken: ");
		int measurementCount = scanner.nextInt();
		scanner.nextLine();
	
		Double[] childTemps = new Double[measurementCount];
		Double[] adultTemps = new Double[measurementCount];
		Double[] elderlyTemps = new Double[measurementCount];
		
		for(int i = 0; i < measurementCount; i++) {
			System.out.print("Child measurement: ");
			childTemps[i] = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.print("Adult measurement: ");
			adultTemps[i] = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.print("Elderly measurement: ");
			elderlyTemps[i] = scanner.nextDouble();
		}		
		
		ChildPatient pC = new ChildPatient(mBS, 1, "Jose", childTemps);
		AdultPatient pA = new AdultPatient(mIS, 1, "Luiz", adultTemps);
		ElderlyPatient pI = new ElderlyPatient(mIS, 1, "Gustavo", elderlyTemps);
		
		pC.sortTemperatures();
		pA.sortTemperatures();
		pI.sortTemperatures();
		
		System.out.println("Child patient temperatures: ");
		for(int c = 0; c < measurementCount; c++) {
			System.out.println(pC.getTemperaturesDuringDay()[c]);
		}
		
		System.out.println("Adult patient temperatures: ");
		for (int a = 0; a < measurementCount; a++) {
			System.out.println(pA.getTemperaturesDuringDay()[a]);
		}
		
		System.out.println("Elderly patient temperatures: ");
		for (int i = 0; i < measurementCount; i++) {
			System.out.println(pI.getTemperaturesDuringDay()[i]);
		}
	}

}
