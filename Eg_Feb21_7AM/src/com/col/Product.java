package com.col;

import java.util.Date;

public class Product {
	private int id;
	private String name;
	private float price;
	private Date mfd;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getMfd() {
		return mfd;
	}
	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}
	
	@Override
	public String toString() {
		return getId()+"  "+getName()+"  "+getPrice()+"  "+getMfd();
	}
}
