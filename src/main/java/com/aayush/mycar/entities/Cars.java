package com.aayush.mycar.entities;

import java.math.BigInteger;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cars")
public class Cars {

	private BigInteger id;
	private String name;
	private String colour;
	private String company;
	private double price;
	
	public Cars(BigInteger id, String name, String colour, String company, double price) {
		this.id = id;
		this.name = name;		
		this.colour = colour;
		this.company = company;
		this.price = price;
	}
//	This is a sample comment just for verification.

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCompany() {
		return company;
	}
	//This too is another comment
	//line 2 again

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}