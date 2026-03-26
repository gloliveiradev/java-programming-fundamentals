package View;

import java.time.LocalDate;
import java.util.Scanner;

import Controlador.ProductSpecificationController;
import Controlador.SaleItemController;
import Controlador.SaleController;

/**
 * Defines the class App for this project.
 */
public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter the number of products: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		ProductSpecificationController epc = new ProductSpecificationController();
		SaleItemController ivc = new SaleItemController();
		SaleController vc = new SaleController();
		
		for (int i = 0; i < quantity; i++)
		{
			System.out.printf("Enter the product description " + (i + 1) + " : ");
			String productDescription = scanner.nextLine();
			
			System.out.printf("Enter the product price " + (i + 1) + " : ");
			double productPrice = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.printf("Enter the sold quantity: ");
			int soldQuantity = scanner.nextInt();
			scanner.nextLine();
			
			epc.createProductSpecification(productDescription, productPrice);
			ivc.createSaleItem(soldQuantity, epc.getProductSpecification(i));
		}
		
		LocalDate currentDate = LocalDate.now();
		
		vc.createSale(currentDate, ivc.getSaleItems());
		
		System.out.printf("Printing receipt...\n");
		System.out.printf("Item      Description     Unit Price   Quantity     Total Price\n");
		System.out.printf("-------------------------------------------------------------------\n");
		for (int j = 0; j < quantity ; j++ ) {
			String productName = epc.getProductDescription(j);
			double productPrice = epc.getProductPrice(j);
			double productSubtotal = ivc.soldSubtotal(j);
			System.out.printf((j+1) + "          " + productName + "           " + productPrice + "              " + ivc.soldQuantity(j) + "              " + productSubtotal + "\n");
		}
		System.out.printf("-------------------------------------------------------------------");
		System.out.printf("\nTotal price R$ : " + vc.calculateTotal());
	}

}
