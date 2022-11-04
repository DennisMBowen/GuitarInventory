package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Oct 31, 2022
 */

@Entity
public class Guitar {
	
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String model;
	private double wholesalePrice;
	private double retailPrice;
	private int inventoryCount;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getInventoryCount() {
		return inventoryCount;
	}
	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}
	
	public Guitar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guitar(String brand, String model, double wholesalePrice, double retailPrice, int inventoryCount) {
		super();
		this.brand = brand;
		this.model = model;
		this.wholesalePrice = wholesalePrice;
		this.retailPrice = retailPrice;
		this.inventoryCount = inventoryCount;
	}

	public Guitar(long id, String brand, String model, double wholesalePrice, double retailPrice, int inventoryCount) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.wholesalePrice = wholesalePrice;
		this.retailPrice = retailPrice;
		this.inventoryCount = inventoryCount;
	}

}
