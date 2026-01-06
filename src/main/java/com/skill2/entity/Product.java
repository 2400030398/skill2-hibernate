package com.skill2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products") // Or your preferred table name
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;

    // IMPORTANT: You must have a No-Argument Constructor for Hibernate
    public Product() {}

    // Constructor to match your MainApp usage (Lines 18-19)
    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

    // Add Getters and Setters for all fields (especially getName() and setPrice())
}