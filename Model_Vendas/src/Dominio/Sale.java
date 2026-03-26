package Dominio;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Defines the class Sale for this project.
 */
public class Sale {
	private LocalDate SaleDate;
	private ArrayList<SaleItem> Sales;

	public Sale(LocalDate saleDate, ArrayList<SaleItem> sales) {
		SaleDate = saleDate;
		Sales = sales;
	}

	public LocalDate getSaleDate() {
		return SaleDate;
	}


	public void setSaleDate(LocalDate saleDate) {
		SaleDate = saleDate;
	}


	public ArrayList<SaleItem> getSales() {
		return Sales;
	}


	public void setSales(ArrayList<SaleItem> sales) {
		Sales = sales;
	}

	public double calculateTotal() {
		double total = 0;
		for (SaleItem saleItem : Sales) {
			total = total + saleItem.subtotal();
		}
		
		return total;
	}
}
