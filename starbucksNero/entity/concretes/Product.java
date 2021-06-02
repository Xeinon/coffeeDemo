package starbucksNero.entity.concretes;

import starbucksNero.entity.abstracts.Entity;

public class Product implements Entity {

	private int id;
	private String productName;
	private int productUnit;
	
	public Product(int id, String productName, int productUnit) {
		super();
		this.id = id;
		this.productName = productName;
		this.productUnit = productUnit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(int productUnit) {
		this.productUnit = productUnit;
	}
	
	
	
}
