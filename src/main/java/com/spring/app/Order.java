package com.spring.app;

public class Order {

	private String orderId;
	private String name;
	private int qty;
	private double price;
	
	public Order(String orderId, String name, int qty, double price) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public Order() {
		super();
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
		
}
