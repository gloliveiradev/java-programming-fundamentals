package Controlador;

import java.util.ArrayList;

import Dominio.ProductSpecification;
import Dominio.SaleItem;

/**
 * Defines the class SaleItemController for this project.
 */
public class SaleItemController {
	ArrayList<SaleItem> soldItems = new ArrayList<SaleItem>();
	
	public void createSaleItem(int quantity, ProductSpecification product) {
		SaleItem saleItem = new SaleItem(quantity, product);
		soldItems.add(saleItem);
	}
	
	public ArrayList<SaleItem> getSaleItems(){
		return soldItems;
	}
	
	public int soldQuantity(int i) {
		return soldItems.get(i).getQuantity();
	}
	
	public double soldSubtotal(int i) {
		return soldItems.get(i).subtotal();
	}
}
