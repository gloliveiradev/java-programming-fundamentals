package Controlador;

import java.time.LocalDate;
import java.util.ArrayList;

import Dominio.SaleItem;
import Dominio.Sale;

/**
 * Defines the class SaleController for this project.
 */
public class SaleController {
	Sale sale;
	ArrayList<Sale> sales = new ArrayList<Sale>();

	public void createSale(LocalDate saleDate, ArrayList<SaleItem> sales) {
		sale = new Sale(saleDate, sales);
		this.sales.add(sale);
	}
	
	public double calculateTotal() {
		return sale.calculateTotal();
	}
}
