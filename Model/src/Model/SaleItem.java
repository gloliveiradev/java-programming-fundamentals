package Model;

/**
 * Defines the class SaleItem for this project.
 */
public class SaleItem {
	int Quantity;
	double Subtotal;
	
	public int getQuantity() {
		return Quantity;
	}
	
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	public double getSubtotal() {
		return Subtotal;
	}
	
	public void setSubtotal(double subtotal) {
		Subtotal = subtotal;
	}
}
