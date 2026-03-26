package Controlador;

import java.util.ArrayList;

import Dominio.ProductSpecification;


/**
 * Defines the class ProductSpecificationController for this project.
 */
public class ProductSpecificationController {
	ArrayList<ProductSpecification> specifiedProducts = new ArrayList<ProductSpecification>();
	
	public void createProductSpecification(String description, double price) {
		ProductSpecification specification = new ProductSpecification(description, price);
		specifiedProducts.add(specification);
	}
	
	public String getProductDescription(int i) {
		return specifiedProducts.get(i).getDescription();
	}
	
	public Double getProductPrice(int i) {
		return specifiedProducts.get(i).getPrice();
	}
	
	public ProductSpecification getProductSpecification(int i) {
		return specifiedProducts.get(i);
	}
}
