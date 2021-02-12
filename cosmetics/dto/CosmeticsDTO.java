package com.xworkz.cosmetics.dto;


import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;

public class CosmeticsDTO implements Comparable{
	
	private String brand;
	private CosmeticShade shades;
	private double price;
	private int quantity;
	private CosmeticType type;
	
	
	
	public CosmeticsDTO(String brand, CosmeticShade shades, double price, int quantity, CosmeticType type) {
		super();
		this.brand = brand;
		this.shades = shades;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}
	public CosmeticsDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public CosmeticShade getShades() {
		return shades;
	}
	public void setShades(CosmeticShade shades) {
		this.shades = shades;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CosmeticType getType() {
		return type;
	}
	public void setType(CosmeticType TONER) {
		this.type = TONER;
	}
	
	@Override
	public String toString() {
		return "CosmeticsDTO [brand=" + brand + ", shades=" + shades + ", price=" + price + ", quantity=" + quantity
				+ ", type=" + type + "]";
	}
//	public void setCosmeticType(CosmeticType toner) {
//		// TODO Auto-generated method stub
//		
//	}
	public void setCosmeticType(CosmeticType toner) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


}
