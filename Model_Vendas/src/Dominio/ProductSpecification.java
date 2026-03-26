package Dominio;

/**
 * Defines the class ProductSpecification for this project.
 */
public class ProductSpecification {
	private String Description;
	private Double Price;
	
	public ProductSpecification(String description, Double price) {
		Description = description;
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
}
