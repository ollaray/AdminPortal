package com.adminportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Shoe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int size;
	private String color;
	private String title;
	private double listPrice;
	private double ourPrice;
	private double shippingWeight;
	private String category;
	private boolean active = true;
	private int sku;
	
	@Column(columnDefinition="text")
	private String description;
	private int inStockNumber;
	
	@Transient
	private MultipartFile shoeImage;
	
	public Shoe() {}
	
	public Shoe(Long id, int size, String color, String title, double listPrice, double ourPrice, double shippingWeight,
			String category, boolean active, int sku, String description, int inStockNumber, MultipartFile shoeImage) {
		super();
		this.id = id;
		this.size = size;
		this.color = color;
		this.title = title;
		this.listPrice = listPrice;
		this.ourPrice = ourPrice;
		this.shippingWeight = shippingWeight;
		this.category = category;
		this.active = active;
		this.sku = sku;
		this.description = description;
		this.inStockNumber = inStockNumber;
		this.shoeImage = shoeImage;
	}



	public Shoe(int size, String color, String title, double listPrice, double ourPrice, double shippingWeight,
			String category, boolean active, int sku, String description, int inStockNumber, MultipartFile shoeImage) {
		super();
		this.size = size;
		this.color = color;
		this.title = title;
		this.listPrice = listPrice;
		this.ourPrice = ourPrice;
		this.shippingWeight = shippingWeight;
		this.category = category;
		this.active = active;
		this.sku = sku;
		this.description = description;
		this.inStockNumber = inStockNumber;
		this.shoeImage = shoeImage;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public double getOurPrice() {
		return ourPrice;
	}

	public void setOurPrice(double ourPrice) {
		this.ourPrice = ourPrice;
	}

	public double getshippingWeight() {
		return shippingWeight;
	}

	public void setshippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getInStockNumber() {
		return inStockNumber;
	}

	public void setInStockNumber(int inStockNumber) {
		this.inStockNumber = inStockNumber;
	}

	public MultipartFile getShoeImage() {
		return shoeImage;
	}

	public void setShoeImage(MultipartFile shoeImage) {
		this.shoeImage = shoeImage;
	}

	@Override
	public String toString() {
		return "Shoe [id=" + id + ", size=" + size + ", color=" + color + ", listPrice=" + listPrice + ", ourPrice="
				+ ourPrice + ", shippingWeight=" + shippingWeight + ", category=" + category + ", active=" + active
				+ ", sku=" + sku + ", description=" + description + ", inStockNumber=" + inStockNumber + ", shoeImage="
				+ shoeImage + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
