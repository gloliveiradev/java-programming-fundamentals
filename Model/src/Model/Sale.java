package Model;

import java.util.Date;

/**
 * Defines the class Sale for this project.
 */
public class Sale {
	Date SaleDate = new Date();
	double TotalAmount;
	
	public Date getSaleDate() {
		return SaleDate;
	}
	
	public void setSaleDate(Date saleDate) {
		SaleDate = saleDate;
	}
	
	public double getTotalAmount() {
		return TotalAmount;
	}
	
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	} 
}
