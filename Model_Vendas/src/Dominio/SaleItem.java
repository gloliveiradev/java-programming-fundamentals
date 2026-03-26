package Dominio;

/**
 * Defines the class SaleItem for this project.
 */
public class SaleItem {
	private int Quantity;
	
	public SaleItem(int quantity, ProductSpecification product) {
		Quantity = quantity;
		Product = product;
	}
	private ProductSpecification Product;
	
	public SaleItem() {
		
	}
	
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public ProductSpecification getProduct() {
		return Product;
	}
	public void setProduct(ProductSpecification product) {
		Product = product;
	}
	public double subtotal() {
		return Product.getPrice() * Quantity;
	}
}
