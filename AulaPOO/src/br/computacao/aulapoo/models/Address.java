package br.computacao.aulapoo.models;

/**
 * Defines the class Address for this project.
 */
public class Address {
	
	public Address(long id, String street, String number, String district) {
		super();
		this.id = id;
		this.street = street;
		this.number = number;
		this.district = district;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	private long id;
	private String street;
	private String number;
	private String district;
}
