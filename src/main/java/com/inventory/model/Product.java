package com.inventory.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	private String productId;
	private double price;
	private double unit;
	private long quantity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId", nullable = false)
	private Category category;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brandId", nullable = true)
	private Brand brand;
	private String addedBy;
	private Date dateAdded;

	public Product() {
		super();
	}

	public Product(int id, String productName, String productId, double price, double unit, long quantity, Category category, Brand brand, String addedBy, Date dateAdded) {
		this.id = id;
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.unit = unit;
		this.quantity = quantity;
		this.category = category;
		this.brand = brand;
		this.addedBy = addedBy;
		this.dateAdded = dateAdded;
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

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
}
